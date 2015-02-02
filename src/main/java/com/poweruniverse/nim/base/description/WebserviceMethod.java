package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;


/**
 * webservice方法的配置信息
 * @author Administrator
 *
 */
public class WebserviceMethod {
	private String name = null;
	private Webservice webservice = null;

	public WebserviceMethod(Webservice webservice,String name) {
		this.webservice = webservice;
		this.name = name;
	}	

	public Webservice getWebservice() {
		return webservice;
	}

	public String getName() {
		return name;
	}	
	
	public Method getMethod() throws Exception {
		Class<?> targetWsClass = null;
		if(webservice.isLocalService()){
			//取得目标webservice类的method 直接调用
			targetWsClass = Class.forName(((LocalWebservice)webservice).getServiceClass());
		}else{
			//使用webservice方式调用
			targetWsClass = Class.forName(((RemoteWebservice)webservice).getClientClass());
		}
		
		Method method=null;
		if(targetWsClass!=null){
			//检查类中是否存在此名称的方法
			for(Method m:targetWsClass.getMethods()){
				if(m.getName().equals(name)){
					method = m;
					break;
				}
			}
		}
		return method;
	}	

}
