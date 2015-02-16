package com.poweruniverse.nim.base.message;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * 方法调用的返回结果
 * json类型
 * @author Administrator
 *
 */
public class JSONDataResult implements Result {
	private static final long serialVersionUID = -7111514299949856465L;
	
	private Boolean success = true;
	private String errorMsg = null;
	private int totalCount = 0;
	private int start = 0;
	private int limit = 0;
	private JSONObject params = new JSONObject();
	private JSONObject meta = new JSONObject();


	private JSONArray rows = new JSONArray();
	
	public JSONDataResult(String errorMsg ){
		this.success = false;
		this.errorMsg = errorMsg;
	}

	public JSONDataResult(JSONArray rows,int totalCount,int start,int limit,JSONObject meta){
		this.success = true;
		this.rows = rows;
		this.totalCount = totalCount;
		this.start = start;
		this.limit = limit;
		this.meta = meta;
	}
	
	public void addRow(JSONObject row){
		this.rows.add(row);
	}
	
	public JSONArray getRows(){
		return this.rows;
	}
	

	public boolean isSuccess() {
		return success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getStart() {
		return start;
	}

	public int getLimit() {
		return limit;
	}

	public JSONObject getParams() {
		return params;
	}

	public void setParams(JSONObject params) {
		this.params = params;
	}

	@Override
	public String toString() {
		JSONObject info = new JSONObject();
		info.put("success", success);
		info.put("errorMsg", errorMsg);
		info.put("totalCount", totalCount);
		info.put("start", start);
		info.put("limit", limit);
		info.put("rows", rows);
		info.put("meta", meta);
		info.put("params", params);
		return info.toString();
	}

}
