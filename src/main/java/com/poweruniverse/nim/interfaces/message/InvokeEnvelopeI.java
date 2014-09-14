package com.poweruniverse.nim.interfaces.message;

import java.lang.reflect.Method;

import net.sf.json.JSONObject;


public interface InvokeEnvelopeI extends java.io.Serializable {
	
	
	public boolean isInnerInvoke();

	public Method getTargetMethod() throws Exception;


	public InvokeSourceI getSource() ;
	public void setSource(InvokeSourceI source);

	public InvokeTargetI getTarget() ;
	public void setTarget(InvokeTargetI target);

	public JSONObject getParams();
	public void setParams(JSONObject params) ;


}
