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
	private static Application instance = null;
	private String contextPath = null;//当前程序运行路径

	private String name = null; //当前系统的名称
	private String title = null; //页面默认标题
	private String modulePath = null; //源文件路径
	private String ip = null;   //当前服务器ip
	private String port = null;   //当前服务器port
	private String webservicePort = null;//当前服务器webservice端口

	private String loginPage = null;
	private String homePage = null;
	
	private String mode = "work";
	private String srcPath = null; //源文件路径
	private String jdkPath = null; //jdk路径


	private Map<String,Component> componentMap = new HashMap<String,Component>();

	public static Application init(String contextPath,String name,String title,String mode,String modulePath,String ip,String port,String webservicePort){
		if(instance == null){
			//读取参数 创建实例
			instance = new Application(); 
			instance.contextPath = contextPath;
			instance.name = name;
			instance.title = title;
			instance.mode = mode;
			
			instance.modulePath = modulePath;
			
			instance.ip = ip;
			instance.port = port;
			instance.webservicePort = webservicePort;
		}
		return instance;
	}
	
	public static void setDevelopConfig(String srcPath,String jdkPath){
		instance.srcPath = srcPath;
		instance.jdkPath = jdkPath;
	}
	
	public static Application getInstance() throws Exception{
		if(instance == null){
			throw new Exception("在使用Application的getInstance方法前，必须调用init方法进行初始化！");
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
	public String getTitle() {
		return title;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public String getJdkPath() {
		return jdkPath;
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
	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}


//--------------------------------------------------------

	public void addComponent(Component cmp){
		componentMap.put(cmp.getName(),cmp);
	}
	
	public Component getComponent(String cmpName){
		return componentMap.get(cmpName);
	}
	
	public boolean containsComponent(String cmpName){
		return componentMap.containsKey(cmpName);
	}
	
	public Set<String> getComponentKeySet(){
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

	public String getModulePath() {
		return this.modulePath;
	}

	public String getContextPath() {
		return this.contextPath;
	}

	public boolean isDevelopMode() {
		return !"work".equals(this.mode);
	}

	public boolean isPlateformMode() {
		return "plateform".equals(this.mode);
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}


}
