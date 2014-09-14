package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：角色权限功能操作明细
*/
public interface JueSeCZTJI   extends BaseEntityI {
			
	// 属性：权限说明 （quanXianSM）
	
	public java.lang.String getQuanXianSM();
	public void setQuanXianSM(java.lang.String quanXianSM);
	
	// 集合：公式集合 （gss）
	public java.util.Set<JueSeCZTJGSI> getGss();
	public void setGss(java.util.Set<JueSeCZTJGSI> gss);
	
	// 主键：jueSeCZTJDM
	public java.lang.Integer getJueSeCZTJDM();
	public void setJueSeCZTJDM(java.lang.Integer jueSeCZTJDM);

	// 对象：角色权限功能操作 （jueSeCZ）
	public JueSeCZI getJueSeCZ();
	public void setJueSeCZ(JueSeCZI jueSeCZ);

}