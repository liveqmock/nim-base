package com.poweruniverse.nim.base.description;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;

import javax.xml.ws.Endpoint;

import net.sf.json.JSONObject;

/**
 * 对某个local组件的描述
 * @author Administrator
 *
 */
public class LocalComponent extends Component {
	
	public LocalComponent(String name) {
		super();
		this.name = name;
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("isLocal", isLocalComponent());
		return data;
	}
	
	public boolean isLocalComponent() {
		return true;
	}
	
	public void addWebservice(LocalWebservice ws){
		webserviceMap.put(ws.getName(),ws);
	}
	
	public LocalWebservice getWebservice(String wsName){
		return (LocalWebservice)webserviceMap.get(wsName);
	}

	public void initialize(){
		//根据配置信息 初始化当前服务组件
		;
	}
	
	public void publish(){
		//读取此组件的同名配置文件
		System.out.println("-------------------------------------------");
		System.out.println("发布组件("+this.getName()+")...");
		try {
			Application app = Application.getInstance();
			for(String wsName: this.getWebserviceKeySet()){
				LocalWebservice webservice = this.getWebservice(wsName);
				
				try{
					String url  =  "http://"+app.getIp()+":"+app.getWebservicePort()+"/ws/"+this.getName()+"/"+wsName;
					System.out.println("	为组件("+this.getName()+")发布webservice("+wsName+")...到 "+url+"...");
					Object serviceInstance = Class.forName(webservice.getServiceClass()).newInstance();
					Endpoint.publish(url,serviceInstance);
					System.out.println("	为组件("+this.getName()+")发布webservice("+wsName+")...成功");
					
					if(app.getIp().equals("127.0.0.1") && app.getIp().equals("8080")){
						//在本地8080端口启动时 认为是开发模式
		        		generateClientCode(url,wsName);
		        	}
				}catch (Exception e){
					System.err.println("	为组件("+this.getName()+")发布webservice("+wsName+")...失败");
					e.printStackTrace();
				}
			}
			System.out.println("发布组件("+this.getName()+")...成功");
		} catch (Exception e) {
			System.err.println("发布组件("+this.getName()+")...失败："+e.getMessage());
			e.printStackTrace();
		}
	}
	
    private void generateClientCode(String wsUrl,String wsName){
    	try {
        	Application app = Application.getInstance();
    		//如果jdkPath webserviceSrc参数不为空且有效 且client目录为空
			File dataTransWSClientFilePath = new File(app.getWebserviceSrc()+"com/poweruniverse/nim/wsclient/"+this.getName()+"/"+wsName+"/");
			if(!dataTransWSClientFilePath.exists() || dataTransWSClientFilePath.list(
				new FilenameFilter(){
					public boolean accept(File dir, String name) {
						return name.endsWith("java");
					}
				}
			).length==0){
				//不存在的话 
				//使用jdk的wsimport 生成client代码
				String ls_1;
				String cmdString = "cmd /c "+app.getJdkPath()+"bin/wsimport -p "+"com.poweruniverse.nim.wsclient."+this.getName()+"."+wsName+" -keep "+wsUrl+"?wsdl";
				
				Process process2 = Runtime.getRuntime().exec(cmdString, null, new File(app.getWebserviceSrc()));
				BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
				while ( (ls_1=bufferedReader2.readLine()) != null){
					System.out.println(ls_1);
				}
				process2.waitFor();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
