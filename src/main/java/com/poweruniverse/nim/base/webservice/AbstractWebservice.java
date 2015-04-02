package com.poweruniverse.nim.base.webservice;

import java.util.List;
import java.util.Map;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import net.sf.json.JSONObject;

import com.poweruniverse.nim.base.bean.UserInfo;
import com.poweruniverse.nim.base.message.InvokeEnvelope;
import com.poweruniverse.nim.base.message.JSONDataResult;
import com.poweruniverse.nim.base.message.JSONMessageResult;
import com.poweruniverse.nim.base.message.Result;
import com.poweruniverse.nim.base.utils.Encrypt;
import com.poweruniverse.nim.base.utils.InvokeUtils;
import com.poweruniverse.nim.base.utils.NimJSONObject;
import com.sun.net.httpserver.HttpExchange;
import com.sun.xml.internal.ws.developer.JAXWSProperties;

public abstract class AbstractWebservice {
	public static final String ENCRYPT_USER_PROPERTY = "ws_auth_user";
	public static final String ENCRYPT_PASSWORD_PROPERTY = "ws_auth_password";
	public static final String ENCRYPT_KEY_PROPERTY = "ws_auth_key";

	protected UserInfo userInfo = null;

	public AbstractWebservice() {
		super();
	}

	protected Integer getYongHuDM(WebServiceContext wsContext,boolean forceExists) throws Exception{
		Integer yongHuDM = null;
		if(wsContext==null){
			if(userInfo!=null){
				yongHuDM = userInfo.getYongHuDM();
			}
		}else{
			MessageContext mc = wsContext.getMessageContext(); 
			@SuppressWarnings("unchecked")
			Map<String, List<String>> http_headers = (Map<String, List<String>>) mc.get(  MessageContext.HTTP_REQUEST_HEADERS);

			String userIdentifier = null;
			String pwdIdentifier =  null;
			String key =  null;
			if(http_headers!=null){
				List<String> userList = (List<String>)http_headers.get(ENCRYPT_USER_PROPERTY);
				List<String> passwordList = (List<String>)http_headers.get(ENCRYPT_PASSWORD_PROPERTY);
				List<String> keyList = (List<String>)http_headers.get(ENCRYPT_KEY_PROPERTY);
				userIdentifier = userList.get(0);
				pwdIdentifier = passwordList.get(0);
				key = keyList.get(0);
			}
			
			if(userIdentifier!=null && pwdIdentifier!=null && key!=null){
				String userCode = Encrypt.desDecrypt(userIdentifier,key);
				String userPwd = Encrypt.desDecrypt(pwdIdentifier.toString(),key);
				
				//调用nim-data 服务的userAuth方法 （）取得用户代码
				JSONObject paramter = new JSONObject();
				paramter.put("userName", userCode);
				paramter.put("userPassword", userPwd);
				paramter.put("clientIP", getClientIP(wsContext));
				
				InvokeEnvelope invokeEnvelope = new InvokeEnvelope("nim-plateform", null, "nim-data", "verify", "userAuth", paramter);
				Result result = InvokeUtils.invokeService(invokeEnvelope);
				if(result.isSuccess()){
					JSONMessageResult jResult = (JSONMessageResult)result;
					yongHuDM =  jResult.getInt("yongHuDM");
				}else if(forceExists){
					throw new Exception(result.getErrorMsg());
				}
				
			}else if(forceExists){
				throw new Exception("未提供用于校验用户身份的参数(用户名、密码、加密key)!");
			}
		}
		return yongHuDM;
	}
	
	protected String getClientIP(WebServiceContext wsContext){
		String ip = null;
		if(wsContext==null){
			if(userInfo!=null){
				ip = userInfo.getIp();
			}
		}else{
			MessageContext mc = wsContext.getMessageContext();
			HttpExchange exchange = (HttpExchange) mc.get(JAXWSProperties.HTTP_EXCHANGE);
			ip = exchange.getRemoteAddress().getAddress().getHostAddress();
		}
		return ip;
	}

}
