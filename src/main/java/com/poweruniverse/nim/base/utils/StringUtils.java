package com.poweruniverse.nim.base.utils;

public class StringUtils {
	
	public static String capFirst(String str){
		if(str==null || str.length()==0){
			return str;
		}
		String firstChar = str.substring(0,1);
		return firstChar.toUpperCase()+str.substring(1);
	}
	
	public static String uncapFirst(String str){
		if(str==null || str.length()==0){
			return str;
		}
		String firstChar = str.substring(0,1);
		return firstChar.toLowerCase()+str.substring(1);
	}

}
