package com.poweruniverse.nim.base.description;

import net.sf.json.JSONObject;

/**
 * 对某个remote组件的描述
 * @author Administrator
 *
 */
public class RemoteComponent extends Component {

	private String ip = null;
	private String webservicePort = null;

	public RemoteComponent(String name,String ip, String webservicePort) {
		super();
		this.name = name;
		this.ip = ip;
		this.webservicePort = webservicePort;
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("ip", ip);
		data.put("webservicePort", webservicePort);
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

}
