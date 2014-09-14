package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：用户角色
*/
public interface YongHuJSI extends BaseEntityI {
	
	// 对象：角色 （jueSe）
	public JueSeI getJueSe();
	public void setJueSe(JueSeI jueSe);

	// 主键：yongHuJSDM
	public java.lang.Integer getYongHuJSDM();
	public void setYongHuJSDM(java.lang.Integer yongHuJSDM);

	// 对象：用户 （yongHu）
	public YongHuI getYongHu();
	public void setYongHu(YongHuI yongHu);

	
}