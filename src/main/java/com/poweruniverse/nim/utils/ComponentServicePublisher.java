package com.poweruniverse.nim.utils;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.xml.ws.Endpoint;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.poweruniverse.nim.bean.ComponentInfo;

public class ComponentServicePublisher {

	public static void publish(String contextPath,ComponentInfo componentInfo){
		//读取此组件的同名配置文件
		String componentName = componentInfo.getName();
		System.out.println("准备为组件("+componentName+")发布webservice...");
		try {
			//先查找web-inf/同名.xml 
			SAXReader reader = new SAXReader();
			File cmpCfgFile = new File(contextPath+componentName+".xml");
			Document cmpCfgDoc = null;
			if(!cmpCfgFile.exists()){
				//如果不存在 再查找类路径下的
				InputStream cis = ComponentServicePublisher.class.getClassLoader().getResourceAsStream("/"+componentName+".xml");
				if(cis!=null){
					cmpCfgDoc =  reader.read(cis);
				}
			}else{
				cmpCfgDoc = reader.read(cmpCfgFile);
			}
			if(cmpCfgDoc!=null){
				Element cmpCfgEl = cmpCfgDoc.getRootElement();//services XML:ROOT-EL
				@SuppressWarnings("unchecked")
				List<Element> wsEls = (List<Element>)cmpCfgEl.elements("service");
				for(Element wsEl : wsEls){
					String wsName = wsEl.attributeValue("service-name");
					String wsClass = wsEl.attributeValue("class-name");
					//记录
					componentInfo.addWebservice(wsName,wsClass);
					//发布
					
					try{
						String url  =  "http://"+componentInfo.getIp()+":"+componentInfo.getWebservicePort()+"/ws/"+componentName+"/"+wsName;
						System.out.println("		为组件("+componentName+")发布webservice("+wsName+")...到 "+url+"...");
						Object serviceInstance = Class.forName(wsClass).newInstance();
						Endpoint.publish(url,serviceInstance);
						System.out.println("			组件("+componentName+")的webservice("+wsName+")...发布成功");
						
						//为当前组件(server_name相同)的webservice服务 生成clientKey
//					if(current_APP_name.equals(appName)){
//						//生成客户端代码
//						System.out.println("......为webservice("+appName+"."+wsName+")..生成客户端代码...");
//						if(current_APP_src!=null && current_APP_jdk!=null){
//							generateClientCode(url,"com.poweruniverse."+appName+".client."+wsName,current_APP_src,current_APP_jdk);
//						}
//						System.out.println("......为webservice("+appName+"."+wsName+")..生成客户端代码......成功 ");
//					}
						
					}catch (Exception e){
						System.err.println("		组件("+componentName+")的webservice("+wsName+")...发布失败");
						e.printStackTrace();
					}
				}
			}
			System.out.println("	为组件("+componentName+")发布webservice...完成");
		} catch (Exception e) {
			System.err.println("	为组件("+componentName+")发布webservice失败："+e.getMessage());
			e.printStackTrace();
		}
		
		//database 初始化
//		List<Element> databaseEls = (List<Element>)cfgEl.elements("database");
//		for(Element databaseEl : databaseEls){
//			DBInfoMap.put(databaseEl.attributeValue("name"),databaseEl.attributeValue("cfg-file-name"));
////			HibernateSessionFactory.initSessionFactory(databaseEl.attributeValue("name"),databaseEl.attributeValue("cfg-file-name"));
//		}

	}

}
