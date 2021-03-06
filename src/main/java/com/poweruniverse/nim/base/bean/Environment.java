package com.poweruniverse.nim.base.bean;

import com.poweruniverse.nim.base.description.Application;



public class Environment {
	
	//此对象作为一个变量记录在session时的名称
	public final static String ENV = "environment";
	//webservice方法调用对象 在session中的名称
//	public final static String INVOKE = "invoke";
	//当前登录用户 实际权限
	private UserInfo loginUser = null;
	//当前用户 模拟权限
	private UserInfo authUser = null;
	//当前用户 客户端地址
//	private String clientIp = null;
	
	public Environment(UserInfo user) {
		super();
		this.loginUser = user;
		this.authUser = this.loginUser;
//		this.clientIp = ip;
		
		if(user!=null){
			Application.loggedUserAdd();
		}
	}

	/**
	 * httpSessionListener监听到会话destroy的时候 调用此方法 减少 当前登录用户计数
	 */
	public void userLogout(){
		if(loginUser!=null){
			Application.onlineUserSubtract();
			this.loginUser = null;
			this.authUser = null;
		}
	}

	public void userLogin(UserInfo loginUser){
		if(loginUser!=null){
			Application.loggedUserAdd();
			this.loginUser = loginUser;
			this.authUser = loginUser;
		}
	}

	public UserInfo getLoginUser() {
		return this.loginUser;
	}

	public UserInfo getAuthUser() {
		return this.authUser;
	}

	/**
	 * 模拟其他用户的权限
	 * @param authUser
	 */
	public void setAuthUser(UserInfo authUser) {
		this.authUser = authUser;
	}


//	public String getClientIp() {
//		return this.clientIp;
//	}

}
