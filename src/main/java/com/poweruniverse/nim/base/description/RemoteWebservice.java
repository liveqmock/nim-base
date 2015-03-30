package com.poweruniverse.nim.base.description;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;

import com.poweruniverse.nim.base.utils.InvokeUtils;

/**
 * webservice服务的配置信息
 * @author Administrator
 *
 */
public class RemoteWebservice extends Webservice{
	private String serviceClass = null;
	private String clientServiceClass = null;

	public RemoteWebservice(RemoteComponent component,String wsName,String clientClass,String clientServiceClass) {
		super(component,wsName);
		this.serviceClass = clientClass;
		this.clientServiceClass = clientServiceClass;
	}	

	public String getServiceClass() {
		return serviceClass;
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
		Class<?> wsclientClass = Class.forName(serviceClass);
		
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

	//取得远程wenservice服务接口类的实现
	public Object getServiceInstance(){
		Object servicePortInstance = null;
		try {
			RemoteComponent rc = (RemoteComponent)this.getComponent();
			
			String simpleClassName = clientServiceClass.substring(clientServiceClass.lastIndexOf(".")+1);

			String wsClientClassName = rc.getClientPackage()+"."+this.getName()+"."+simpleClassName+"Service";
			
			Constructor<?> wsClientClassConstructor = Class.forName(wsClientClassName).getConstructor(new Class[]{URL.class});
			Object[] args = new Object[1];
			args[0] = new URL(RemoteWebservice.class.getResource("."),this.getRemoteWebserviceWSDL() );
			Object serviceInstance = wsClientClassConstructor.newInstance(args);
			//使用getXXXPort方法 得到webservice代理实例
			Method getServicePortMethod = serviceInstance.getClass().getMethod("get"+simpleClassName+"Port", new Class[]{});
			
			servicePortInstance = getServicePortMethod.invoke(serviceInstance, new Object[]{});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servicePortInstance;
	}
}
