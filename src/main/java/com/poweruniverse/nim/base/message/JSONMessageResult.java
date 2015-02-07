package com.poweruniverse.nim.base.message;

import net.sf.json.JSONObject;


/**
 * 方法调用的返回结果
 * json类型
 * @author Administrator
 *
 */
public class JSONMessageResult implements Result {
	private static final long serialVersionUID = -7111514299949856465L;
	
	private Boolean success = true;
	private String errorMsg = null;
	private JSONObject info = new JSONObject();
	
	public JSONMessageResult(){
	}
	
	public JSONMessageResult(String errorMsg ){
		this.success = false;
		this.errorMsg = errorMsg;
	}

	public JSONMessageResult(String key,Object val ){
		this.success = false;
		this.info.put(key, val);
	}
	
	public void put(String key,Object val ){
		this.info.put(key, val);
	}

	public boolean isSuccess() {
		return success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String toString() {
		return success?("true"+info.toString()):("false:"+errorMsg);
	}

}
