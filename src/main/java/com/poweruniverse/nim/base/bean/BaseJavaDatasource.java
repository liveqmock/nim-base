package com.poweruniverse.nim.base.bean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public abstract class BaseJavaDatasource {
	/**
	 * 返回值格式：{
	 * 	totalCount:0,
	 * 	start:0,
	 * 	limit:0,
	 * 	rows:[{},{},...]
	 * }
	 */
	public abstract JSONObject getData(JSONArray filters,JSONObject params,int start,int limit);

}
