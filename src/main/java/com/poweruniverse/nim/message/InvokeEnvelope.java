package com.poweruniverse.nim.message;

import java.lang.reflect.Method;

import net.sf.json.JSONObject;

import com.poweruniverse.nim.base.bean.UserInfo;
import com.poweruniverse.nim.base.description.Application;
import com.poweruniverse.nim.base.description.Component;
import com.poweruniverse.nim.base.description.Webservice;
import com.poweruniverse.nim.base.description.WebserviceMethod;


public class InvokeEnvelope{
	private static final long serialVersionUID = -7111514299949856465L;
	
	private Component InvokeComponent = null;//发出请求服务的组件
	private UserInfo InvokeUser = null;//发出请求服务的用户
	
	private WebserviceMethod targetWebserviceMethod = null;//被请求的组件-服务-方法 
	
	private JSONObject params = null;//请求参数
	
	public InvokeEnvelope(String sourceCmpName,UserInfo user,String targetCmpName,String targetWsName,String targetMethodName,JSONObject params) throws Exception {
		super();
		if(!Application.containsComponent(sourceCmpName)){
			throw new Exception("in InvokeEnvelope constuctor:源组件"+sourceCmpName+"不存在！");
		}
		this.InvokeComponent = Application.getComponent(sourceCmpName);
		this.InvokeUser = user;
		
		if(!Application.containsComponent(targetCmpName)){
			throw new Exception("in InvokeEnvelope constuctor:目标组件"+targetCmpName+"不存在！");
		}
		Component targetComponent = Application.getComponent(targetCmpName);
		
		if(!targetComponent.containsWebservice(targetWsName)){
			throw new Exception("in InvokeEnvelope constuctor:服务"+targetCmpName+"."+targetWsName+"不存在！");
		}
		Webservice targetWebservice = targetComponent.getWebservice(targetWsName);
		
		if(!targetWebservice.containsMethod(targetMethodName)){
			throw new Exception("in InvokeEnvelope constuctor:服务"+targetCmpName+"."+targetWsName+"."+targetMethodName+"不存在！");
		}
		targetWebserviceMethod = targetWebservice.getMethod(targetMethodName);

		this.params = params;
	}

	/**
	 * 判断是否内部调用
	 */
	public boolean isInnerInvoke() {
		return targetWebserviceMethod.getWebservice().getComponent().isLocalComponent();
	}

	/**
	 * 取得要调用的方法对象
	 */
	public Method getTargetMethod() throws Exception{
		return targetWebserviceMethod.getMethod();
	}

	public JSONObject getParams() {
		return params;
	}

	public void setParams(JSONObject params) {
		this.params = params;
	}
	
	public Component getInvokeComponent() {
		return InvokeComponent;
	}

	public WebserviceMethod getTargetWebserviceMethod() {
		return targetWebserviceMethod;
	}

	public void setInvokeUser(UserInfo invokeUser) {
		InvokeUser = invokeUser;
	}



}
