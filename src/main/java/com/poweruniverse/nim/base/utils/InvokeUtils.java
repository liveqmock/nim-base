package com.poweruniverse.nim.base.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebParam;
import javax.xml.ws.BindingProvider;

import net.sf.json.JSONNull;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.poweruniverse.nim.base.bean.UserInfo;
import com.poweruniverse.nim.base.description.RemoteWebservice;
import com.poweruniverse.nim.base.message.InvokeEnvelope;
import com.poweruniverse.nim.base.message.JSONMessageResult;
import com.poweruniverse.nim.base.message.Result;
import com.poweruniverse.nim.base.webservice.BasePlateformWebservice;

public class InvokeUtils {
	private static Logger logger = null;
	/**
	 * 从servlet发起对服务组件的调用
	 * @return
	 */
	public static Result invokeService(InvokeEnvelope invokeEnvelope){
		Result ret = null;
		if(logger==null){
	        logger = Logger.getLogger("nim-base");
		}
		//
		logger.debug("收到调用请求："+invokeEnvelope);
		//
		try {
			//取得本次调用的目标server
			Method targetMethod = invokeEnvelope.getTargetWebservice().getMethod(invokeEnvelope.getTargetMethodName());
			if(targetMethod == null){
				return new JSONMessageResult(
						"组件("+invokeEnvelope.getTargetWebservice().getComponent().getName()+") - "+ 
						"服务("+invokeEnvelope.getTargetWebservice().getName()+") - 方法("+invokeEnvelope.getTargetMethodName()+")不存在！"
				);
			}
			//如果目标服务在当前服务器上 直接调用
			//否则 使用webservice调用
			if(invokeEnvelope.isInnerInvoke()){
				//取得目标webservice类的method 直接调用
				//使用客户端传递来的参数 直接调用webservice实现类
				
				/*以下调用带参的、私有构造函数*/
	            Constructor<?> serviceConstructor = targetMethod.getDeclaringClass().getConstructor(new Class[]{UserInfo.class});   
	            Object serviceInstance = serviceConstructor.newInstance(new Object[]{invokeEnvelope.getInvokeUser()});

				ret = doMethodInvokeByParams(serviceInstance,targetMethod,invokeEnvelope);
			}else{
				//使用反射方法 取得构建方法 创建webservice实例
            	RemoteWebservice remoteWebservice = (RemoteWebservice)invokeEnvelope.getTargetWebservice();
				Constructor<?> wsClientClassConstructor = Class.forName(remoteWebservice.getClientServiceClass()).getConstructor(new Class[]{URL.class});
				Object[] args = new Object[1];
				args[0] = new URL(InvokeUtils.class.getResource("."),remoteWebservice.getRemoteWebserviceWSDL() );
				Object serviceInstance = wsClientClassConstructor.newInstance(args);
				//使用getXXXPort方法 得到webservice代理实例
				Method getServicePortMethod = serviceInstance.getClass().getMethod("get"+targetMethod.getDeclaringClass().getSimpleName()+"Port", new Class[]{});
				Object servicePortInstance = getServicePortMethod.invoke(serviceInstance, new Object[]{});
				
				//加入当前调用信息
				BindingProvider provider = (BindingProvider)servicePortInstance;  
				//加入当前用户信息 用于目标服务不信任源情况下 重新进行用户验证的情况
				provider.getRequestContext().put(BasePlateformWebservice.ENCRYPT_KEY_PROPERTY, invokeEnvelope.getInvokeUser().getKey());
				provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, invokeEnvelope.getInvokeUser().getDengLuDHIdentifier());
				provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, invokeEnvelope.getInvokeUser().getDengLuMMIdentifier());
				//用客户端传递来的参数 调用webservice方法
				ret = doMethodInvokeByParams(servicePortInstance,targetMethod,invokeEnvelope);
			}
			logger.debug("调用成功:"+invokeEnvelope.getId());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("调用出错："+e.getMessage(),e);
			ret = new JSONMessageResult("调用出错："+e.getMessage());
		}
		return ret;
	}
	
	
	private static Result doMethodInvokeByParams(Object servicePortInstance,Method targetMethod,InvokeEnvelope invokeEnvelope) 
			throws IllegalAccessException,IllegalArgumentException,InvocationTargetException{
		
		Class<?>[] parameterTypes =  targetMethod.getParameterTypes();
		Annotation[][] parameterAnnotations = targetMethod.getParameterAnnotations();
		
		JSONObject paramterJsonObj = invokeEnvelope.getParams();
		
		Object[] arguments = new Object[parameterTypes.length];
		for(int i = 0;i<parameterTypes.length;i++){
			Object param = null;
			Annotation paramAnnotation = parameterAnnotations[i][0];
			String paramName = null;
			if(paramAnnotation instanceof WebParam){
				paramName = ((WebParam)paramAnnotation).name();
			}else{
				return new JSONMessageResult("需要使用@WebParam 为("+servicePortInstance.getClass().getName()+"."+targetMethod.getName()+")webservice方法中的参数设置注释！");
			}
			//取得客户端传递来的参数值 转换为正确的类型
			if(paramterJsonObj!=null && paramterJsonObj.containsKey(paramName) ){
				param = getObjectWithCorrectValue(paramterJsonObj.get(paramName),parameterTypes[i]);
			}
			arguments[i] = param;
		}
		//执行方法得到返回结果
		return (Result)targetMethod.invoke(servicePortInstance,arguments);
	}
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static Object getObjectWithCorrectValue(Object value,Class<?> type) throws IllegalArgumentException {
		if(value == null || value instanceof JSONNull){
			return null;
		}
		if(!value.getClass().equals(type)){
			if(type.equals(String.class)){
				value = value.toString();
			}else if(type.equals(Double.class)){
				value = Double.valueOf(value.toString()).doubleValue();
			}else if(type.equals(Integer.class)){
				value = Double.valueOf(value.toString()).intValue();
			}else if (type.equals(Date.class)){
				value = sdf.format(value.toString());
			}else if (type.equals(Boolean.class) || type.equals(boolean.class)){
				value = "true".equals(value.toString());
			}else{
				throw new IllegalArgumentException("未定义处理方式的类型:"+type);
			}
		}
		return value;
	}

}
