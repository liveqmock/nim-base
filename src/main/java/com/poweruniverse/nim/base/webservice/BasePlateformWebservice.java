package com.poweruniverse.nim.base.webservice;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import net.sf.json.JSONObject;

import com.poweruniverse.nim.base.message.InvokeEnvelope;
import com.poweruniverse.nim.base.message.JSONDataResult;
import com.poweruniverse.nim.base.message.Result;
import com.poweruniverse.nim.base.utils.Encrypt;
import com.poweruniverse.nim.base.utils.InvokeUtils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.xml.internal.ws.developer.JAXWSProperties;

public abstract class BasePlateformWebservice {
	public static final String ENCRYPT_USER_PROPERTY = "ws_auth_user";
	public static final String ENCRYPT_PASSWORD_PROPERTY = "ws_auth_password";
	public static final String ENCRYPT_KEY_PROPERTY = "ws_auth_key";

	public BasePlateformWebservice() {
		super();
	}

	
	protected Integer getYongHuDM(WebServiceContext wsContext,boolean forceExists) throws Exception{
		Integer yongHuDM = null;
		MessageContext mc = wsContext.getMessageContext(); 
		Object codeIdentifier = mc.get(ENCRYPT_USER_PROPERTY);
		Object pwdIdentifier = mc.get(ENCRYPT_PASSWORD_PROPERTY);
		Object key = mc.get(ENCRYPT_KEY_PROPERTY);
		
		if(codeIdentifier!=null && pwdIdentifier!=null&& key!=null){
			String userCode = Encrypt.encrypt(codeIdentifier.toString(),key.toString());
			String userPwd = Encrypt.encrypt(pwdIdentifier.toString(),key.toString());
			
			//调用oim-data 服务的checkLogin方法 （）取得用户代码
			JSONObject paramter = new JSONObject();
			paramter.put("dengLuDH", userCode);
			paramter.put("dengLuMM", userPwd);
			
			try {
				InvokeEnvelope invokeEnvelope = new InvokeEnvelope("oim-base", null, "oim-data", "verify", "checkLogin", paramter);
				Result result = InvokeUtils.invokeService(invokeEnvelope);
				if(result.isSuccess()){
					JSONDataResult jResult = (JSONDataResult)result;
					JSONObject row = jResult.getRows().getJSONObject(0);
					yongHuDM = row.getInt("yongHuDM");
				}
			} catch (Exception e) {
			}
			
		}else if(forceExists){
			throw new Exception("未提供用于校验用户身份的参数(用户名、密码、加密key)!");
		}
		return yongHuDM;
	}
	
	protected String getClientIP(WebServiceContext wsContext){
		MessageContext mc = wsContext.getMessageContext();
		HttpExchange exchange = (HttpExchange) mc.get(JAXWSProperties.HTTP_EXCHANGE);
		return exchange.getRemoteAddress().getAddress().getHostAddress();
	}

}
