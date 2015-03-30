package com.poweruniverse.nim.base.description;

import java.lang.reflect.Method;


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
	
	public String getLocalWebserviceURL() throws Exception{
		Application app = Application.getInstance();
		return this.getWebserviceURL(app.getIp(),app.getWebservicePort());
	}
	
	public String getLocalWebserviceWSDL() throws Exception{
		Application app = Application.getInstance();
		return this.getWebserviceWSDL(app.getIp(),app.getWebservicePort());
	}

	public Method getMethod(String mtdName) throws Exception{
		Class<?> sClass = Class.forName(serviceClass);
		Method method=null;
		if(sClass!=null){
			//检查类中是否存在此名称的方法
			for(Method m:sClass.getMethods()){
				if(m.getName().equals(mtdName)){
					method = m;
					break;
				}
			}
		}
		return method;
	}
	
    //取得本地wenservice服务类的实现
  	public Object getServiceInstance(){
  		Object servicePortInstance = null;
  		try {
  			Class<?> wsClass = Class.forName(this.getServiceClass());
  			servicePortInstance = wsClass.newInstance();
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
  		return servicePortInstance;
  	}
}
