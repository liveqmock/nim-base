package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;


/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public abstract class Webservice {
	private String name = null;
	private Component component = null;
	
	public Webservice(Component component,String wsName) {
		this.component = component;
		this.name = wsName;
	}	
	
	public Component getComponent() {
		return component;
	}

	public String getName() {
		return name;
	}	
	
	public abstract boolean isLocalService();

	public String getWebserviceURL(String ip,String port) {
		return "http://"+ip+":"+port+"/ws/"+component.getName()+"/"+name+"";
	}
	
	public String getWebserviceWSDL(String ip,String port) {
		return "http://"+ip+":"+port+"/ws/"+component.getName()+"/"+name+"?wsdl";
	}

	public abstract Object getServiceInstance() throws Exception ;
	
	public abstract Method getMethod(String mtdName) throws Exception ;

		
	public String toString() {
		return this.getComponent().getName()+"."+this.getName();
	}
	
}
