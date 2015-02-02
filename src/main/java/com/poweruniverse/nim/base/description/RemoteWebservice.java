package com.poweruniverse.nim.base.description;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public class RemoteWebservice extends Webservice{
	private String clientClass = null;
	private String clientServiceClass = null;

	public RemoteWebservice(RemoteComponent component,String name,String clientClass,String clientServiceClass) {
		super(component,name);
		this.clientClass = clientClass;
		this.clientServiceClass = clientServiceClass;
	}	

	public String getClientClass() {
		return clientClass;
	}

	public String getClientServiceClass() {
		return clientServiceClass;
	}

	public boolean isLocalService() {
		return false;
	}

}
