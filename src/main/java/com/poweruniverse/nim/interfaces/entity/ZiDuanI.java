package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：字段
*/
public interface ZiDuanI extends BaseEntityI {

	
	// 主键：ziDuanDM
	public java.lang.Integer getZiDuanDM();
	public void setZiDuanDM(java.lang.Integer ziDuanDM);

			
	// 属性：字段代号 （ziDuanDH）
	public java.lang.String getZiDuanDH();
	public void setZiDuanDH(java.lang.String ziDuanDH);
	
			
	// 属性：字段标题 （ziDuanBT）
	public java.lang.String getZiDuanBT();
	public void setZiDuanBT(java.lang.String ziDuanBT);
	
			
	// 属性：关联父类字段名称 （guanLianFLZD）
	public java.lang.String getGuanLianFLZD();
	public void setGuanLianFLZD(java.lang.String guanLianFLZD);
	
	// 对象：实体类 （shiTiLei）
	public ShiTiLeiI getShiTiLei();
	public void setShiTiLei(ShiTiLeiI shiTiLei);

	// 对象：字段类型 （ziDuanLX）
	public ZiDuanLXI getZiDuanLX();
	public void setZiDuanLX(ZiDuanLXI ziDuanLX);

			
	// 属性：数据库列名 （lieMing）
	public java.lang.String getLieMing();
	public void setLieMing(java.lang.String lieMing);
	
			
	// 属性：字段长度 （ziDuanCD）
	public java.lang.Integer getZiDuanCD();
	public void setZiDuanCD(java.lang.Integer ziDuanCD);
	
			
	// 属性：字段精度 （ziDuanJD）
	public java.lang.Integer getZiDuanJD();
	public void setZiDuanJD(java.lang.Integer ziDuanJD);
	
			
	// 属性：字段说明 （ziDuanSM）
	public java.lang.String getZiDuanSM();
	public void setZiDuanSM(java.lang.String ziDuanSM);
	
			
	// 属性：允许空值 （yunXuKZ）
	public java.lang.Boolean getYunXuKZ();
	public void setYunXuKZ(java.lang.Boolean yunXuKZ);
	
			
	// 属性：延迟加载 （yanChiJZ）
	public java.lang.Boolean getYanChiJZ();
	public void setYanChiJZ(java.lang.Boolean yanChiJZ);
	
	// 对象：关联实体类 （guanLianSTL）
	public ShiTiLeiI getGuanLianSTL();
	public void setGuanLianSTL(ShiTiLeiI guanLianSTL);

			
	// 属性：是否唯一 （shiFouWY）
	public java.lang.Boolean getShiFouWY();
	public void setShiFouWY(java.lang.Boolean shiFouWY);
	
			
	// 属性：是否使用 （shiFouSY）
	public java.lang.Boolean getShiFouSY();
	public void setShiFouSY(java.lang.Boolean shiFouSY);
	
	// 对象：关联父类字段对象 （guanLianFLZDObj）
	public ZiDuanI getGuanLianFLZDObj();
	public void setGuanLianFLZDObj(ZiDuanI guanLianFLZDObj);

	
}