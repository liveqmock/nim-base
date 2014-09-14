package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：操作模板条件公式
*/
public interface CaoZuoMBTJGSI   extends BaseEntityI {
	
			
	// 属性：字段描述 （ziDuanMS）
	
	public java.lang.String getZiDuanMS();
	public void setZiDuanMS(java.lang.String ziDuanMS);
	
			
	// 属性：授权结果公式 （caoZuoQXGS）
	
	public java.lang.String getCaoZuoQXGS();
	public void setCaoZuoQXGS(java.lang.String caoZuoQXGS);
	
			
	// 属性：授权结果显示 （caoZuoQXXS）
	
	public java.lang.String getCaoZuoQXXS();
	public void setCaoZuoQXXS(java.lang.String caoZuoQXXS);
	
			
	// 属性：操作值 （ziDuanQZ）
	
	public java.lang.String getZiDuanQZ();
	public void setZiDuanQZ(java.lang.String ziDuanQZ);
	
			
	// 属性：操作符 （ziDuanCZF）
	
	public java.lang.String getZiDuanCZF();
	public void setZiDuanCZF(java.lang.String ziDuanCZF);
	
			
	// 属性：最后字段属性 （ziDuanSX）
	
	public java.lang.String getZiDuanSX();
	public void setZiDuanSX(java.lang.String ziDuanSX);
	
	// 对象：操作模板条件明细 （caoZuoMBTJ）
	public CaoZuoMBTJI getCaoZuoMBTJ();
	public void setCaoZuoMBTJ(CaoZuoMBTJI caoZuoMBTJ);

	// 主键：caoZuoMBTJGSDM
	public java.lang.Integer getCaoZuoMBTJGSDM();
	public void setCaoZuoMBTJGSDM(java.lang.Integer caoZuoMBTJGSDM);

	
}