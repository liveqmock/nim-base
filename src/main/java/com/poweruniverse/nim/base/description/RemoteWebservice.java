package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;
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
	private String remoteIp = null;
	private String remoteWebservicePort = null;

	public RemoteWebservice(RemoteComponent component,String wsName,String ip,String wsPort,String clientClass,String clientServiceClass) {
		super(component,wsName);
		this.clientClass = clientClass;
		this.clientServiceClass = clientServiceClass;
		this.remoteIp = ip;
		this.remoteWebservicePort = wsPort;
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

	public String getRemoteWebserviceURL() {
		return this.getWebserviceURL(remoteIp,remoteWebservicePort);
	}
	
	public String getRemoteWebserviceWSDL() {
		return this.getWebserviceWSDL(remoteIp,remoteWebservicePort);
	}
	
	public Method getMethod(String mtdName) throws Exception{
		Class<?> wsclientClass = Class.forName(clientClass);
		
		Method method=null;
		if(wsclientClass!=null){
			//检查类中是否存在此名称的方法
			for(Method m:wsclientClass.getMethods()){
				if(m.getName().equals(mtdName)){
					method = m;
					break;
				}
			}
		}
		return method;
	}

}
