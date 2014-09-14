package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：角色
*/
public interface JueSeI   extends BaseEntityI {
	// 集合：角色权限功能操作 （qxs）
	public java.util.Set<JueSeCZI> getCzs();
	public void setCzs(java.util.Set<JueSeCZI> czs);
	
	// 主键：jueSeDM
	public java.lang.Integer getJueSeDM();
	public void setJueSeDM(java.lang.Integer jueSeDM);

			
	// 属性：角色名称 （jueSeMC）
	
	public java.lang.String getJueSeMC();
	public void setJueSeMC(java.lang.String jueSeMC);
	
	// 属性：角色名称 （jueSeBH）
	
	public java.lang.String getJueSeBH();
	public void setJueSeBH(java.lang.String jueSeBH);
	
	// 对象：系统 （xiTong）
	public XiTongI getXiTong();
	public void setXiTong(XiTongI xiTong);

	// 对象：系统 （buMen）
	public BuMenI getBuMen();
	public void setBuMen(BuMenI buMen);

	
	
}