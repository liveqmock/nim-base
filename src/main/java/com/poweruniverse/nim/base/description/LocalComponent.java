package com.poweruniverse.nim.base.description;

import net.sf.json.JSONObject;

/**
 * 对某个local组件的描述
 * @author Administrator
 *
 */
public class LocalComponent extends Component {
	
	public LocalComponent(String name) {
		super();
		this.name = name;
	}
	
	public JSONObject getJSONData(){
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("isLocal", isLocalComponent());
		return data;
	}
	
	public boolean isLocalComponent() {
		return true;
	}
	
	public void initialize(){
		//根据配置信息 初始化当前服务组件
		;
	}

}
