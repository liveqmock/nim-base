package com.poweruniverse.nim.interfaces.entity;

/*
* 实体类：实体类
*/
public interface ShiTiLeiI  extends BaseEntityI  {
	
			
	// 属性：实体类名称 （shiTiLeiMC）
	
	public java.lang.String getShiTiLeiMC();
	public void setShiTiLeiMC(java.lang.String shiTiLeiMC);
	
	// 主键：shiTiLeiDM
	public java.lang.Integer getShiTiLeiDM();
	public void setShiTiLeiDM(java.lang.Integer shiTiLeiDM);

			
	// 属性：主键列 （zhuJianLie）
	
	public java.lang.String getZhuJianLie();
	public void setZhuJianLie(java.lang.String zhuJianLie);
	
			
	// 属性：显示列 （xianShiLie）
	
	public java.lang.String getXianShiLie();
	public void setXianShiLie(java.lang.String xianShiLie);
	
			
	// 属性：JAVA类名 （shiTiLeiClassName）
	
	public java.lang.String getShiTiLeiClassName();
	public void setShiTiLeiClassName(java.lang.String shiTiLeiClassName);
	
			
	// 属性：数据库表名 （biaoMing）
	
	public java.lang.String getBiaoMing();
	public void setBiaoMing(java.lang.String biaoMing);
	
	// 集合：字段集合 （zds）
	public java.util.Set<ZiDuanI> getZds();
	public void setZds(java.util.Set<ZiDuanI> zds);
	
			
	// 属性：是否数据库表 （shiFouSJKB）
	
	public java.lang.Boolean getShiFouSJKB();
	public void setShiFouSJKB(java.lang.Boolean shiFouSJKB);
	
			
	// 属性：是否功能 （shiFouGN）
	
	public java.lang.Boolean getShiFouGN();
	public void setShiFouGN(java.lang.Boolean shiFouGN);
	
			
	// 属性：功能代号 （gongNengDH）
	
	public java.lang.String getGongNengDH();
	public void setGongNengDH(java.lang.String gongNengDH);
	
	// 属性：是否业务表 （shiFouYWB）
	
	public java.lang.Boolean getShiFouYWB();
	public void setShiFouYWB(java.lang.Boolean shiFouYWB);
	
			
	// 属性：排序列 （paiXuLie）
	
	public java.lang.String getPaiXuLie();
	public void setPaiXuLie(java.lang.String paiXuLie);
	
			
	// 属性：实体类代号 （shiTiLeiDH）
	
	public java.lang.String getShiTiLeiDH();
	public void setShiTiLeiDH(java.lang.String shiTiLeiDH);
	
	//本实体类中 字段代号为参数指定的字段是否存在
	public boolean hasZiDuan(String ziDuanDH);
	//取得本实体类中 字段代号为参数指定的字段
	public ZiDuanI getZiDuan(String ziDuanDH);

}