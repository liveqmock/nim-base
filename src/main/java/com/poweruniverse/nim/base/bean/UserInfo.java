package com.poweruniverse.nim.base.bean;

import java.util.Calendar;

import com.poweruniverse.nim.base.utils.Encrypt;


public class UserInfo {
	private Integer yongHuDM;
	private String yongHuMC;
	private String dengLuDH;
	private String dengLuMM;
	
	private String key;
	private String dengLuDHIdentifier;
	private String dengLuMMIdentifier;
	
	private String ip;//用户登录的ip地址
	
	public UserInfo(Integer yongHuDM, String yongHuMC, String dengLuDH,String dengLuMM, String ip) {
		super();
		this.yongHuDM = yongHuDM;
		this.yongHuMC = yongHuMC;
		this.dengLuDH = dengLuDH;
		this.dengLuMM = dengLuMM;
		
		this.ip = ip;

		this.key = ""+Calendar.getInstance().getTimeInMillis();
		try {
			this.dengLuDHIdentifier = Encrypt.desEncrypt(this.dengLuDH, this.key);
			this.dengLuMMIdentifier = Encrypt.desEncrypt(this.dengLuMM, this.key);
		} catch (Exception e) {
		}
	}

	public Integer getYongHuDM() {
		return yongHuDM;
	}

	public String getYongHuMC() {
		return yongHuMC;
	}

	public String getDengLuDH() {
		return dengLuDH;
	}

	public String getDengLuMM() {
		return dengLuMM;
	}

	public String getKey() {
		return key;
	}

	public String getDengLuDHIdentifier() {
		return dengLuDHIdentifier;
	}

	public String getDengLuMMIdentifier() {
		return dengLuMMIdentifier;
	}

	public String getIp() {
		return ip;
	}


}
