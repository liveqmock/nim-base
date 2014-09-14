package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：角色权限功能操作明细公式
*/
public interface JueSeCZTJGSI   extends BaseEntityI {
	
	// 主键：jueSeCZTJGSDM
	public java.lang.Integer getJueSeCZTJGSDM();
	public void setJueSeCZTJGSDM(java.lang.Integer jueSeCZTJGSDM);

			
	// 属性：授权结果显示 （caoZuoQXXS）
	
	public java.lang.String getCaoZuoQXXS();
	public void setCaoZuoQXXS(java.lang.String caoZuoQXXS);
	
			
	// 属性：授权结果公式 （caoZuoQXGS）
	
	public java.lang.String getCaoZuoQXGS();
	public void setCaoZuoQXGS(java.lang.String caoZuoQXGS);
	
			
	// 属性：字段描述 （ziDuanMS）
	
	public java.lang.String getZiDuanMS();
	public void setZiDuanMS(java.lang.String ziDuanMS);
	
			
	// 属性：最后字段属性 （ziDuanSX）
	
	public java.lang.String getZiDuanSX();
	public void setZiDuanSX(java.lang.String ziDuanSX);
	
			
	// 属性：操作符 （ziDuanCZF）
	
	public java.lang.String getZiDuanCZF();
	public void setZiDuanCZF(java.lang.String ziDuanCZF);
	
			
	// 属性：操作值 （ziDuanQZ）
	
	public java.lang.String getZiDuanQZ();
	public void setZiDuanQZ(java.lang.String ziDuanQZ);
	
	// 对象：角色权限功能操作明细 （jueSeCZTJ）
	public JueSeCZTJI getJueSeCZTJ();
	public void setJueSeCZTJ(JueSeCZTJI jueSeCZTJ);

}