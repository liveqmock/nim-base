package com.poweruniverse.nim.interfaces;

import com.poweruniverse.nim.bean.ComponentInfo;

public interface ComponentI {
	public String getComponentName();
	public void initial(String contextPath,ComponentInfo cfg);
}
