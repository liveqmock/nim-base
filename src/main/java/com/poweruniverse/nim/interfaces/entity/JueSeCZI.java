package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：角色权限功能操作
*/
public interface JueSeCZI   extends BaseEntityI {
	
	// 主键：jueSeCZDM
	public java.lang.Integer getJueSeCZDM();
	public void setJueSeCZDM(java.lang.Integer jueSeCZDM);

	// 对象：角色 （jueSe）
	public JueSeI getJueSe();
	public void setJueSe(JueSeI jueSe);

	// 对象：功能操作 （caoZuo）
	public CaoZuoI getCaoZuo();
	public void setCaoZuo(CaoZuoI caoZuo);

	// 集合：权限明细 （mxs）
	public java.util.Set<JueSeCZTJI> getTjs();
	public void setTjs(java.util.Set<JueSeCZTJI> tjs);

	// 对象：操作模版 （caoZuoMB）
	public CaoZuoMBI getCaoZuoMB();
	public void setCaoZuoMB(CaoZuoMBI caoZuoMB);

}