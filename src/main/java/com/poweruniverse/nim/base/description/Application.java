package com.poweruniverse.nim.base.description;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

/**
 * 对当前应用的描述
 * 单实例模式
 */
public class Application {
	private Application instance = null;

	private String name = null; //当前系统的名称
	private String ip = null;   //当前服务器ip
	private String port = null;   //当前服务器port
	private String webservicePort = null;//当前服务器webservice端口

	private static Map<String,Component> componentMap = new HashMap<String,Component>();

	public Application getInstance(){
		if(instance == null){
			//读取参数 创建实例
			instance = new Application(); 
//			instance.name = name;
//			instance.ip = ip;
//			instance.port = port;
//			instance.webservicePort = webservicePort;
		}
		return instance;
	}
	
	private Application() {
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("ip", ip);
		data.put("port", port);
		data.put("webservicePort", webservicePort);
		return data;
	}
	
	public String getName() {
		return name;
	}

	public String getIp() {
		return ip;
	}

	public String getPort() {
		return port;
	}

	public String getWebservicePort() {
		return webservicePort;
	}

	public static void addComponent(Component cmp){
		componentMap.put(cmp.getName(),cmp);
	}
	
	public static Component getComponent(String cmpName){
		return componentMap.get(cmpName);
	}
	
	public static boolean containsComponent(String cmpName){
		return componentMap.containsKey(cmpName);
	}
	
	public static Set<String> getComponentKeySet(){
		return componentMap.keySet();
	}

	
	//-----------------------------------------------------------
	/**
	 * httpSessionListener监听到会话create的时候 调用此方法 增加在线用户计数 不影响当前登录用户计数
	 */
	private static int onlineUserCount = 0;//在线用户数  
	private static int loggedUserCount = 0;//登陆用户数

	public static void onlineUserAdd(){
		onlineUserCount++;
	}
	public static void onlineUserSubtract(){
		onlineUserCount--;
	}

	public static void loggedUserAdd(){
		loggedUserCount++;
	}

	public static void loggedUserAddSubtract(){
		loggedUserCount--;
	}
	
	public static int getOnlineUserCount() {
		return onlineUserCount;
	}
	public static int getLoggedUserCount() {
		return loggedUserCount;
	}


}
