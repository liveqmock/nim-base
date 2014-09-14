package com.poweruniverse.nim.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.poweruniverse.nim.interfaces.ComponentI;

import net.sf.json.JSONObject;

public class ApplicationInfo {
	private ComponentI instance = null;
	private String name = null;
	private String ip = null;
	private String webservicePort = null;
	private boolean localMode = true;

	private Map<String,String> serviceMap = new HashMap<String,String>();

	
	public ApplicationInfo(String name,ComponentI componentInst, String ip, String webservicePort,boolean isLocalService) {
		super();
		this.name = name;
		this.instance = componentInst;
		this.ip = ip;
		this.webservicePort = webservicePort;
		this.localMode = isLocalService;
	}
	
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("isLocalMode", localMode);
		data.put("ip", ip);
		data.put("webservicePort", webservicePort);
		return data;
	}
	
	public String getIp() {
		return ip;
	}

	public String getWebservicePort() {
		return webservicePort;
	}

	public void addWebservice(String wsName, String wsClass){
		serviceMap.put(wsName,wsClass);
	}
	
	public String getWebserviceClass(String wsName){
		return serviceMap.get(wsName);
	}
	
	public boolean containsWebservice(String wsName){
		return serviceMap.containsKey(wsName);
	}
	
	public Set<String> getWebserviceKeySet(){
		return serviceMap.keySet();
	}

	public String getName() {
		return name;
	}


	public ComponentI getInstance() {
		return instance;
	}
	
	public boolean isLocalMode() {
		return localMode;
	}


}
