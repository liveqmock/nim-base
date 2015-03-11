package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;

/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public class RemoteWebservice extends Webservice{
	private String clientClass = null;
	private String clientServiceClass = null;

	public RemoteWebservice(RemoteComponent component,String wsName,String clientClass,String clientServiceClass) {
		super(component,wsName);
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

	public String getRemoteWebserviceURL() {
		RemoteComponent rc = (RemoteComponent)this.getComponent();
		return this.getWebserviceURL(rc.getIp(),rc.getWebservicePort());
	}
	
	public String getRemoteWebserviceWSDL() {
		RemoteComponent rc = (RemoteComponent)this.getComponent();
		return this.getWebserviceWSDL(rc.getIp(),rc.getWebservicePort());
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
