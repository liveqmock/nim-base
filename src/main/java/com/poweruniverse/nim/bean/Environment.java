package com.poweruniverse.nim.bean;

import com.poweruniverse.nim.interfaces.entity.YongHuI;



public class Environment {
	private static int onlineUsers = 0;//在线用户数  
	private static int loggedUsers = 0;//登陆用户数
	/**
	 * httpSessionListener监听到会话create的时候 调用此方法 增加在线用户计数 不影响当前登录用户计数
	 */
	public static void userVisit(){
		onlineUsers++;
	}
	public static void userLeave(){
		onlineUsers--;
	}
	
	//此对象作为一个变量记录在session时的名称
	public final static String ENV = "environment";
	//webservice方法调用对象 在session中的名称
	public final static String INVOKE = "invoke";
	//当前登录用户 实际权限
	private UserInfo loginUser = null;
	//当前用户 模拟权限
	private UserInfo authUser = null;
	private String ip = null;
	
	public Environment(YongHuI yh,String ip) {
		super();
		this.loginUser = new UserInfo(yh);
		this.authUser = this.loginUser;
		this.ip = ip;
		loggedUsers++;
	}

	/**
	 * httpSessionListener监听到会话destroy的时候 调用此方法 减少在线用户计数 当前登录用户计数
	 */
	public void userLogout(){
		if(loginUser!=null){
			loggedUsers--;
			loginUser = null;
			authUser = null;
		}
	}


	
	public static int getOnlineUsers() {
		return onlineUsers;
	}
	public static int getLoggedUsers() {
		return loggedUsers;
	}


	public UserInfo getAuthUser() {
		return authUser;
	}


	public void setAuthUser(UserInfo authUser) {
		this.authUser = authUser;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public UserInfo getLoginUser() {
		return loginUser;
	}
}
