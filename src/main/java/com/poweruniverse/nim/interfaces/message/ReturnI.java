package com.poweruniverse.nim.interfaces.message;



/**
 * 方法调用的返回结果
 * json类型
 * @author Administrator
 *
 */
public interface ReturnI extends java.io.Serializable {
	
	

	public boolean isSuccess();
	public void setSuccess(boolean success);

	public String getErrorMsg();
	public void setErrorMsg(String errorMsg);
	
	public Object get(String key);
	public void put(String key,Object value);
}
