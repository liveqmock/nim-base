package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：操作模版
*/
public interface CaoZuoMBI  extends BaseEntityI {
	
			
	// 属性：操作模版名称 （caoZuoMBMC）
	
	public java.lang.String getCaoZuoMBMC();
	public void setCaoZuoMBMC(java.lang.String caoZuoMBMC);
	
	// 主键：caoZuoMBDM
	public java.lang.Integer getCaoZuoMBDM();
	public void setCaoZuoMBDM(java.lang.Integer caoZuoMBDM);

	// 对象：模版类别 （caoZuoMBLB）
	public CaoZuoMBLBI getCaoZuoMBLB();
	public void setCaoZuoMBLB(CaoZuoMBLBI caoZuoMBLB);

			
	// 属性：操作模版代号 （caoZuoMBDH）
	
	public java.lang.String getCaoZuoMBDH();
	public void setCaoZuoMBDH(java.lang.String caoZuoMBDH);
	
	// 对象：功能操作 （gongNengCZ）
	public CaoZuoI getCaoZuo();
	public void setCaoZuo(CaoZuoI caoZuo);

			
	// 属性：操作模版路径 （caoZuoMBLJ）
	
	public java.lang.String getCaoZuoMBLJ();
	public void setCaoZuoMBLJ(java.lang.String caoZuoMBLJ);
	
	// 属性：基础页面 （jiChuYM）
	
	public java.lang.String getJiChuYM();
	public void setJiChuYM(java.lang.String jiChuYM);
	
	
}