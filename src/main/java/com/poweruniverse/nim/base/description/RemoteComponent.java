package com.poweruniverse.nim.base.description;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;

import com.poweruniverse.nim.base.utils.InvokeUtils;

import net.sf.json.JSONObject;

/**
 * 对某个remote组件的描述
 * @author Administrator
 *
 */
public class RemoteComponent extends Component {

	private String ip = null;
	private String webservicePort = null;
	private String clientPackage = null;
	
	public RemoteComponent(String name,String ip, String webservicePort, String clientPackage) {
		super();
		this.name = name;
		this.ip = ip;
		this.webservicePort = webservicePort;
		this.clientPackage = clientPackage;
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("ip", ip);
		data.put("webservicePort", webservicePort);
		data.put("clientPackage", clientPackage);
		data.put("isLocal", isLocalComponent());
		return data;
	}
	
	public String getIp() {
		return ip;
	}

	public String getWebservicePort() {
		return webservicePort;
	}

	public boolean isLocalComponent() {
		return false;
	}
	
	public void addWebservice(RemoteWebservice ws){
		webserviceMap.put(ws.getName(),ws);
	}
	
	public RemoteWebservice getWebservice(String wsName){
		return (RemoteWebservice)webserviceMap.get(wsName);
	}

	public String getClientPackage() {
		return clientPackage;
	}

}
