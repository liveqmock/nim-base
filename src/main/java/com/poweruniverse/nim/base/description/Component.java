package com.poweruniverse.nim.base.description;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 对某个组件的描述
 * @author Administrator
 *
 */
public abstract class Component {
//	public final static String NSB_COMPONENT_name = "nsb";//总线服务组件名称
//	public final static String NRS_COMPONENT_name = "nrs";//报表服务组件名称
//	public final static String NFS_COMPONENT_name = "nfs";//文档服务组件名称
//	public final static String NPS_COMPONENT_name = "nps";//用户权限服务组件名称
//	public final static String NAS_COMPONENT_name = "nas";//用户验证服务组件名称

	protected String name = null;
	
	/**
	 * 
	 */
	protected Map<String,Webservice> webserviceMap = new HashMap<String,Webservice>();
	
	public String getName() {
		return name;
	}
	
	public boolean containsWebservice(String wsName){
		return webserviceMap.containsKey(wsName);
	}
	
	public Set<String> getWebserviceKeySet(){
		return webserviceMap.keySet();
	}
	
	public abstract Webservice getWebservice(String wsName);

	public abstract boolean isLocalComponent();


	
}
