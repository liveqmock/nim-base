package com.poweruniverse.nim.base.description;


/**
 * 本地webservice服务的配置信息
 * @author Administrator
 *
 */
public class LocalWebservice extends Webservice{
	private String serviceClass = null;
	
	public LocalWebservice(LocalComponent component,String name,String className) {
		super(component,name);
		this.serviceClass = className;
	}	
	
	public String getServiceClass() {
		return serviceClass;
	}

	public boolean isLocalService() {
		return true;
	}

}
