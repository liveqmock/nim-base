package com.poweruniverse.nim.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Components {
	public final static String NSB_APP_name = "nsb";//总线服务器配置信息
	public final static String NRS_APP_name = "nrs";//报表服务器配置信息
	public final static String NFS_APP_name = "nfs";//文档服务器配置信息
	public final static String NPS_APP_name = "nps";//用户权限服务配置信息
	public final static String NAS_APP_name = "nas";//用户验证服务配置信息
	
	public final static Map<String,ComponentInfo> Components = new HashMap<String,ComponentInfo>();
	
	public static ComponentInfo getComponent(String key){
		return Components.get(key);
	}
	
	public static void addComponent(String key,ComponentInfo cmp){
		Components.put(key,cmp);
	}
	
	public static Collection<ComponentInfo> getAllComponent(){
		return Components.values();
	}
	
	
}
