package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;

import com.poweruniverse.nim.base.webservice.BasePlateformWebservice;


/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public abstract class Webservice {
	private String name = null;
	private Component component = null;
	private Object instance = null;
	
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

	public Object getInstance() {
		return instance;
	}

	public void setInstance(Object instance) {
		this.instance = instance;
	}

	public abstract Method getMethod(String mtdName) throws Exception ;

}
