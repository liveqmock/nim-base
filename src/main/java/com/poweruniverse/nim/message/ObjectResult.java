package com.poweruniverse.nim.message;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;


/**
 * 方法调用的返回结果
 * @author Administrator
 *
 */
public class ObjectResult implements Result {
	private static final long serialVersionUID = -7111514299949856465L;
	
	private Boolean success = true;
	private String errorMsg = null;
	private Map<String,Object> data = new HashMap<String,Object>();
	
	public ObjectResult(){
		this.success = true;
		this.errorMsg = null;
	}

	public ObjectResult(String errorMsg ){
		this.success = false;
		this.errorMsg = errorMsg;
	}

	public void put(String key,Object value){
		this.data.put(key, value);
	}
	
	public Object get(String key){
		return this.data.get(key);
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


	@Override
	public String toString() {
		JSONObject ret = new JSONObject();
		ret.put("success", success);
		if(!success){
			ret.put("errorMsg", errorMsg);
		}
		return ret.toString();
	}


}
