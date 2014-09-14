package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：用户
*/
public interface YongHuI extends BaseEntityI {
	
	// 主键：yongHuDM
	public java.lang.Integer getYongHuDM();
	public void setYongHuDM(java.lang.Integer yongHuDM);

			
	// 属性：用户名称 （yongHuMC）
	public java.lang.String getYongHuMC();
	public void setYongHuMC(java.lang.String yongHuMC);
	
			
	// 属性：登录名 （dengLuDH）
	public java.lang.String getDengLuDH();
	public void setDengLuDH(java.lang.String dengLuDH);
	
			
	// 属性：登录密码 （dengLuMM）
	public java.lang.String getDengLuMM();
	public void setDengLuMM(java.lang.String dengLuMM);
	
	
}