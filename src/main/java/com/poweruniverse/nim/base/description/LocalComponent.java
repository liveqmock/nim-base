package com.poweruniverse.nim.base.description;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

import javax.xml.ws.Endpoint;

import com.poweruniverse.nim.base.bean.UserInfo;

import net.sf.json.JSONObject;

/**
 * 对某个local组件的描述
 * @author Administrator
 *
 */
public class LocalComponent extends Component {
	
	private String type = null;
	private String clientSrcPath = null;
	private String clientPackage = null;
	public LocalComponent(String name,String type,String clientSrcPath,String clientPackage) {
		super();
		this.name = name;
		this.type = type;
		this.clientSrcPath = clientSrcPath;
		this.clientPackage = clientPackage;
		//检查
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("clientSrcPath", clientSrcPath);
		data.put("clientPackage", clientPackage);
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
					Constructor<?> serviceConstructor = Class.forName(webservice.getServiceClass()).getConstructor(new Class[]{UserInfo.class});   
		            Object serviceInstance = serviceConstructor.newInstance(new Object[]{null});
		            
					Endpoint.publish(url,serviceInstance);
					System.out.println("	为组件("+this.getName()+")发布webservice("+wsName+")...成功");
					
					//根据组件级别和当前系统运行模式，确定是否需要生成webservice 客户端源码
					if("127.0.0.1".equals(app.getIp()) && "8080".equals(app.getPort())){
						if(("plateform".equals(this.type) && app.isPlateformMode()) || ("application".equals(this.type) && app.isDevelopMode())){
							generateClientCode(url,wsName);
			        	}	
					}
					
				}catch (Exception e){
					System.err.println("	为组件("+this.getName()+")发布webservice("+wsName+")...失败");
					e.printStackTrace();
				}
			}
//			System.out.println("发布组件("+this.getName()+")...成功");
		} catch (Exception e) {
			System.err.println("发布组件("+this.getName()+")...失败："+e.getMessage());
			e.printStackTrace();
		}
	}
	
    private void generateClientCode(String wsUrl,String wsName){
    	try {
    		//如果jdkPath webserviceSrc参数不为空且有效 
    		if(this.clientSrcPath == null){
    			System.err.println("	组件("+wsName+")的配置文件中未提供clientSrcPath参数，忽略webservice客户端源码的检查和生成");
    			return;
    		}
    		if(this.clientPackage == null){
    			System.err.println("	组件("+wsName+")的配置文件中未提供clientPackage参数，忽略webservice客户端源码的检查和生成");
    			return;
    		}
    		
    		//webservice客户端源码目录
			File cmpClientSrcPathFile = new File(this.clientSrcPath);
			if(!cmpClientSrcPathFile.exists()){
				System.err.println("	java源文件目录("+cmpClientSrcPathFile.getPath()+")不存在，忽略webservice客户端源码的检查和生成");
    			return;
			}
			File cmpWSClientSrcPathFile = new File(this.clientSrcPath+this.clientPackage.replaceAll("\\.", "/")+"/"+wsName+"/");
			//目录存在 且目录为空(无java文件)
			if(!cmpWSClientSrcPathFile.exists() || cmpWSClientSrcPathFile.list(
				new FilenameFilter(){
					public boolean accept(File dir, String name) {
						return name.endsWith("java");
					}
				}
			).length==0){
				//目标目录下不存在任何java文件的话 
				System.out.println("	本地服务组件("+wsName+")的webservice客户端源码不存在，准备生成 "+this.clientSrcPath+"..."+this.clientPackage);
				//使用jdk的wsimport 生成client代码
				String ls_1;
				String cmdString = "cmd /c "+Application.getInstance().getJdkPath()+"bin/wsimport -p "+this.clientPackage+"."+wsName+" -keep "+wsUrl+"?wsdl";
				
				Process process2 = Runtime.getRuntime().exec(cmdString, null, new File(this.clientSrcPath));
				BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
				while ( (ls_1=bufferedReader2.readLine()) != null){
					System.out.println(ls_1);
				}
				process2.waitFor();
			}else if(Application.getInstance().isDevelopMode()){
				System.out.println("	本地服务组件("+wsName+")的webservice客户端源码已存在，未重新生成 "+cmpWSClientSrcPathFile.getPath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
