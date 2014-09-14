package com.poweruniverse.nim.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Applications {
	public static String current_APP_name = null;
	public final static Map<String,ApplicationInfo> Applications = new HashMap<String,ApplicationInfo>();

	public static ApplicationInfo getApplication(String key){
		return Applications.get(key);
	}
	
	public static void addApplication(String key,ApplicationInfo cmp){
		Applications.put(key,cmp);
	}
	
	public static Collection<ApplicationInfo> getAllApplication(){
		return Applications.values();
	}
	
	public static ApplicationInfo getCurrentApplication() {
		return Applications.get(current_APP_name);
	}

}
