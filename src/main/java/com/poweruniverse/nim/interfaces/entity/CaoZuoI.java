package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：功能操作
*/
public interface CaoZuoI  extends BaseEntityI{
	
	// 主键：caoZuoDM
	public java.lang.Integer getCaoZuoDM();
	public void setCaoZuoDM(java.lang.Integer caoZuoDM);

	// 对象：功能 （gongNeng）
	public GongNengI getGongNeng();
	public void setGongNeng(GongNengI gongNeng);

	// 对象：操作类别 （caoZuoLB）
	public CaoZuoLBI getCaoZuoLB();
	public void setCaoZuoLB(CaoZuoLBI caoZuoLB);

			
	// 属性：操作代号 （caoZuoDH）
	
	public java.lang.String getCaoZuoDH();
	public void setCaoZuoDH(java.lang.String caoZuoDH);
	
			
	// 属性：操作名称 （caoZuoMC）
	
	public java.lang.String getCaoZuoMC();
	public void setCaoZuoMC(java.lang.String caoZuoMC);
	
			
	// 属性：对象相关 （duiXiangXG）
	
	public java.lang.Boolean getDuiXiangXG();
	public void setDuiXiangXG(java.lang.Boolean duiXiangXG);
	
			
	// 属性：可以授权 （keYiSQ）
	
	public java.lang.Boolean getKeYiSQ();
	public void setKeYiSQ(java.lang.Boolean keYiSQ);
	
	// 属性：功能操作序号 （gongNengCZXH）
	
	public java.lang.Integer getCaoZuoXH();
	public void setCaoZuoXH(java.lang.Integer caoZuoXH);
	
			
	// 属性：显示链接 （xianShiLJ）
	public java.lang.Boolean getXianShiLJ();
	public void setXianShiLJ(java.lang.Boolean xianShiLJ);
	
			
	// 属性：是否webService （shiFouWS）
	public java.lang.Boolean getShiFouWS();
	public void setShiFouWS(java.lang.Boolean shiFouWS);
	
	// 对象：替代功能操作 （tiDaiGNCZ）
	public CaoZuoI getTiDaiCZ();
	public void setTiDaiCZ(CaoZuoI tiDaiCZ);

	// 对象：操作模版 （caoZuoMB）
	public CaoZuoMBI getCaoZuoMB();
	public void setCaoZuoMB(CaoZuoMBI caoZuoMB);

	// 集合：操作模版集合 （czmbs）
	public java.util.Set<CaoZuoMBI> getCzmbs();
	public void setCzmbs(java.util.Set<CaoZuoMBI> czmbs);
	
			
	// 属性：是否启用 （shiFouQY）
	
	public java.lang.Boolean getShiFouQY();
	public void setShiFouQY(java.lang.Boolean shiFouQY);
	
	// 属性：是否记录日志 （shiFouJLRZ）
	
	public java.lang.Boolean getShiFouJLRZ();
	public void setShiFouJLRZ(java.lang.Boolean shiFouJLRZ);
	
			
	// 属性：是否多行处理 （shiFouDHCL）
	
	public java.lang.Boolean getShiFouDHCL();
	public void setShiFouDHCL(java.lang.Boolean shiFouDHCL);
	
	// 对象：下一功能操作 （xiaYiGNCZ）
	public CaoZuoI getXiaYiGNCZ();
	public void setXiaYiGNCZ(CaoZuoI xiaYiGNCZ);

	
}