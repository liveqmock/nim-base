package com.poweruniverse.nim.base.message;



/**
 * 方法调用的返回结果
 * json类型
 * @author Administrator
 *
 */
public class StringResult implements Result {
	private static final long serialVersionUID = -7111514299949856465L;
	
	private String content = "";
	
	public StringResult(){
	}
	
	public StringResult(String content ){
		this.content = content;
	}


	public boolean isSuccess() {
		return true;
	}

	public String getErrorMsg() {
		return null;
	}


	public String toString() {
		return content;
	}

}
