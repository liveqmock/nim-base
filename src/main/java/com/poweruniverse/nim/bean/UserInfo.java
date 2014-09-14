package com.poweruniverse.nim.bean;

import com.poweruniverse.nim.interfaces.entity.YongHuI;


public class UserInfo {
	private String code;
	private String name;
	private String password;
	
	public UserInfo(YongHuI yh) {
		super();
		this.code = yh.getDengLuDH();
		this.name = yh.getYongHuMC();
		this.password = yh.getDengLuMM();
	}

	
	public UserInfo(String yongHuDH, String yongHuMC,String dengLuMM) {
		super();
		this.code = yongHuDH;
		this.name = yongHuMC;
		this.password = dengLuMM;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
