package com.poweruniverse.nim.base.message;

import com.poweruniverse.nim.base.utils.NimJSONObject;


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
	private NimJSONObject info = new NimJSONObject();
	
	public JSONMessageResult(){
	}
	
	public JSONMessageResult(String errorMsg ){
		this.success = false;
		this.errorMsg = errorMsg;
	}

	public JSONMessageResult(String key,Object val ){
		this.success = true;
		this.info.put(key, val);
	}
	
	public void put(String key,Object val ){
		this.info.put(key, val);
	}

	public Object get(String key){
		return this.info.get(key);
	}
	
	public boolean has(String key){
		return this.info.has(key);
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
		info.put("success", success);
		info.put("errorMsg", errorMsg);
		return info.toString();
	}

}
