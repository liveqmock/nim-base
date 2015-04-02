package ${clientPackage}.utils;

import java.net.URL;
import java.security.Key;
import java.security.Security;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.Cipher;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
public class ${className} {
	public static final String ENCRYPT_USER_PROPERTY = "ws_auth_user";
	public static final String ENCRYPT_PASSWORD_PROPERTY = "ws_auth_password";
	public static final String ENCRYPT_KEY_PROPERTY = "ws_auth_key";
	
	<#list services as service>
	public static ${clientPackage}.${service[0]}.${service[1]} get${(service[0])?cap_first}ServicePort(String ip,String port,String userName,String password) throws Exception{
		String key = ""+Calendar.getInstance().getTimeInMillis();
		String encryptUserCode = encrypt(userName,key);
		String encryptUserPwd = encrypt(password,key);
		
		//取得服务接口
		URL url = new URL(${className}.class.getResource("."),"http://"+ip+":"+port+"/ws/${componentName}/${service[0]}?wsdl");
		${clientPackage}.${service[0]}.${service[1]}Service ${service[0]}Service = new ${clientPackage}.${service[0]}.${service[1]}Service(url);
		${clientPackage}.${service[0]}.${service[1]} ${service[0]}Port= ${service[0]}Service.get${service[1]}Port();
		
		//加入用户信息
		BindingProvider provider = (BindingProvider)${service[0]}Port;  
        Map<String, Object> req_ctx = provider.getRequestContext();  
  
		//调用的用户名和密码,用map  
		Map<String, List<String>> headers = new HashMap<String, List<String>>();  
		headers.put(ENCRYPT_KEY_PROPERTY, Collections.singletonList(key));
		headers.put(ENCRYPT_USER_PROPERTY, Collections.singletonList(encryptUserCode));
		headers.put(ENCRYPT_PASSWORD_PROPERTY, Collections.singletonList(encryptUserPwd));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);  
        
		return ${service[0]}Port;
	}
	</#list>
	

	/**  
	* 加密字符串  
	*   
	* @param strIn  
	*            需加密的字符串  
	* @return 加密后的字符串  
	* @throws Exception  
	*/
	private static String encrypt(String strIn,String strKey) throws Exception {
		byte[] arrB = strIn.getBytes();
		Security.addProvider(new com.sun.crypto.provider.SunJCE());
		
		// 创建一个空的8位字节数组（默认值为0） 
		byte[] arrBTmp = strKey.getBytes();
		byte[] arrC = new byte[8];
		// 将原始字节数组转换为8位   
		for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
			arrC[i] = arrBTmp[i];
		}
		// 生成密钥   
		Key key = new javax.crypto.spec.SecretKeySpec(arrC, "DES");

		Cipher encryptCipher = Cipher.getInstance("DES");
		encryptCipher.init(Cipher.ENCRYPT_MODE, key);
		
		byte[] aa = encryptCipher.doFinal(arrB);
		
		int iLen = aa.length;
		// 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍   
		StringBuffer sb = new StringBuffer(iLen * 2);
		for (int i = 0; i < iLen; i++) {
			int intTmp = aa[i];
			// 把负数转换为正数   
			while (intTmp < 0) {
			intTmp = intTmp + 256;
			}
			// 小于0F的数需要在前面补0   
			if (intTmp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(intTmp, 16));
		}
		return sb.toString();
	}

}
