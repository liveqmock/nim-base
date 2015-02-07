package com.poweruniverse.nim.base.message;



/**
 * 方法调用的返回结果
 * json类型
 * @author Administrator
 *
 */
public interface Result extends java.io.Serializable {
	
	public boolean isSuccess();
	public String getErrorMsg();
	
}
