package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：系统
*/
public interface XiTongI  extends BaseEntityI {
	
	// 主键：xiTongDM
	public java.lang.Integer getXiTongDM();
	public void setXiTongDM(java.lang.Integer xiTongDM);

			
	// 属性：系统名称 （xiTongMC）
	
	public java.lang.String getXiTongMC();
	public void setXiTongMC(java.lang.String xiTongMC);
	
			
	// 属性：系统代号 （xiTongDH）
	
	public java.lang.String getXiTongDH();
	public void setXiTongDH(java.lang.String xiTongDH);
	
			
	// 属性：需要登录 （xuYaoDL）
	
	public java.lang.Boolean getXuYaoDL();
	public void setXuYaoDL(java.lang.Boolean xuYaoDL);
	
	// 属性：系统首页 （xiTongSY）
	
	public java.lang.String getXiTongSY();
	public void setXiTongSY(java.lang.String xiTongSY);

	// 属性：登录页面 （dengLuYM）
	
	public java.lang.String getDengLuYM();
	public void setDengLuYM(java.lang.String dengLuYM);
	
			
	// 属性：后台页面 （houTaiYM）
	
	public java.lang.String getHouTaiYM();
	public void setHouTaiYM(java.lang.String houTaiYM);
	
			
	// 属性：是否使用验证码 （shiFouSYYZM）
	
	public java.lang.Boolean getShiFouSYYZM();
	public void setShiFouSYYZM(java.lang.Boolean shiFouSYYZM);
	
	
	
}