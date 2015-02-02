package com.poweruniverse.nim.base.bean;

import java.util.Calendar;

import com.poweruniverse.nim.utils.Encrypt;


public class UserInfo {
	private String code;
	private String name;
	private String password;
	private String key;
	private String codeIdentifier;
	private String pwdIdentifier;
	
	public UserInfo(String yongHuDH, String yongHuMC,String dengLuMM) {
		super();
		this.code = yongHuDH;
		this.name = yongHuMC;
		this.password = dengLuMM;
		
		this.key = ""+Calendar.getInstance().getTimeInMillis();
		this.codeIdentifier = Encrypt.encrypt(this.code, this.key);
		this.pwdIdentifier = Encrypt.encrypt(this.password, this.key);
	}

	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getCodeIdentifier(){
		return this.codeIdentifier;
	}

	public String getPwdIdentifier(){
		return this.pwdIdentifier;
	}

}
