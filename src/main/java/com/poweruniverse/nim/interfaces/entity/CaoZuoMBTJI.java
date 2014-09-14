package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：操作模板条件明细
*/
public interface CaoZuoMBTJI   extends BaseEntityI {
	
	// 集合：公式集合 （gss）
	public java.util.Set<CaoZuoMBTJGSI> getGss();
	public void setGss(java.util.Set<CaoZuoMBTJGSI> gss);
	
	// 主键：caoZuoMBTJDM
	public java.lang.Integer getCaoZuoMBTJDM();
	public void setCaoZuoMBTJDM(java.lang.Integer caoZuoMBTJDM);

	// 对象：操作模板 （caoZuoMB）
	public CaoZuoMBI getCaoZuoMB();
	public void setCaoZuoMB(CaoZuoMBI caoZuoMB);

			
	// 属性：条件显示 （liuZhuanTJXS）
	
	public java.lang.String getLiuZhuanTJXS();
	public void setLiuZhuanTJXS(java.lang.String liuZhuanTJXS);
	
	
	
}