package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：部门
*/
public interface BuMenI extends BaseEntityI{

	
	// 主键：buMenDM
	public java.lang.Integer getBuMenDM();
	public void setBuMenDM(java.lang.Integer buMenDM);

			
	// 属性：部门名称 （buMenMC）
	
	public java.lang.String getBuMenMC();
	public void setBuMenMC(java.lang.String buMenMC);
	
			
	// 属性：部门编号 （buMenBH）
	
	public java.lang.String getBuMenBH();
	public void setBuMenBH(java.lang.String buMenBH);
	

}