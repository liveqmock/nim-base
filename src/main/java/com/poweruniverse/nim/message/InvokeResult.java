package com.poweruniverse.nim.message;

import com.poweruniverse.nim.base.bean.UserInfo;



public class InvokeResult extends JSONResult {
	private static final long serialVersionUID = -7111514299949856465L;

	private String invokeComponentName = null;//发出请求服务的组件名称
	private UserInfo invokeUser = null;//发出请求服务的用户
	
	
	public InvokeResult(String invokeComponentName,UserInfo invokeUser){
		super();
		this.invokeComponentName = invokeComponentName;
		this.invokeUser = invokeUser;
	}

	public InvokeResult(String invokeComponentName,UserInfo invokeUser,String errorMsg){
		super(errorMsg);
		this.invokeComponentName = invokeComponentName;
		this.invokeUser = invokeUser;
	}

	public String getInvokeComponentName() {
		return invokeComponentName;
	}

	public UserInfo getInvokeUser() {
		return invokeUser;
	}

}
