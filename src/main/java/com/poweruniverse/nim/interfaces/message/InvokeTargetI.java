package com.poweruniverse.nim.interfaces.message;


public interface InvokeTargetI {
	

//	public ComponentInfo getApplication();

	public String getWsName();
	public String getMethodName();

	public Class<?> getTargetWsClass() throws ClassNotFoundException ;
	public Class<?> getTargetWsClientClass() throws ClassNotFoundException;
	public Class<?> getTargetWsClientServiceClass() throws ClassNotFoundException ;
	
	public String getTargetWsUrl() ;
	

}
