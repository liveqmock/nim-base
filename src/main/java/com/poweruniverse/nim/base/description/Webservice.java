package com.poweruniverse.nim.base.description;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public abstract class Webservice {
	private String name = null;
	private Component component = null;
	
	private Map<String,WebserviceMethod> methodMap = new HashMap<String,WebserviceMethod>();
	
	
	public Webservice(Component component,String name) {
		this.component = component;
		this.name = name;
	}	
	
	public Component getComponent() {
		return component;
	}

	public String getName() {
		return name;
	}	
	
	public void addMethod(WebserviceMethod mtd){
		methodMap.put(mtd.getName(),mtd);
	}
	
	public WebserviceMethod getMethod(String mtdName){
		return methodMap.get(mtdName);
	}
	
	public boolean containsMethod(String mtdName){
		return methodMap.containsKey(mtdName);
	}
	
	public Set<String> getMethodKeySet(){
		return methodMap.keySet();
	}

	public abstract boolean isLocalService();

}
