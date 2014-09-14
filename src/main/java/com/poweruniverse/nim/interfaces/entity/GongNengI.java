package com.poweruniverse.nim.interfaces.entity;
/*
* 实体类：功能
*/
public interface GongNengI  extends BaseEntityI {

	
	// 主键：gongNengDM
	public java.lang.Integer getGongNengDM();
	public void setGongNengDM(java.lang.Integer gongNengDM);

			
	// 属性：功能名称 （gongNengMC）
	
	public java.lang.String getGongNengMC();
	public void setGongNengMC(java.lang.String gongNengMC);
	
			
	// 属性：功能代号 （gongNengDH）
	
	public java.lang.String getGongNengDH();
	public void setGongNengDH(java.lang.String gongNengDH);
	
			
	// 属性：功能实现类 （gongNengClass）
	
	public java.lang.String getGongNengClass();
	public void setGongNengClass(java.lang.String gongNengClass);
	
	// 集合：操作集合 （czs）
	public java.util.Set<CaoZuoI> getCzs();
	public void setCzs(java.util.Set<CaoZuoI> czs);
	
	// 属性：功能图片 （gongNengIMG）
	
	public java.lang.String getGongNengIMG();
	public void setGongNengIMG(java.lang.String gongNengIMG);
	
			
	// 属性：功能文本 （gongNengText）
	
	public java.lang.String getGongNengText();
	public void setGongNengText(java.lang.String gongNengText);
	
			
	// 属性：功能URL （gongNengURL）
	
	public java.lang.String getGongNengURL();
	public void setGongNengURL(java.lang.String gongNengURL);
	
			
	// 属性：功能序号 （gongNengXH）
	
	public java.lang.Integer getGongNengXH();
	public void setGongNengXH(java.lang.Integer gongNengXH);
	
	// 属性：功能序号 （gongNengXH）
	
	public java.lang.Boolean getShiFouLCGN();
	public void setShiFouLCGN(java.lang.Boolean shiFouLCGN);
	
	// 对象：实体类 （shiTiLei）
	public ShiTiLeiI getShiTiLei();
	public void setShiTiLei(ShiTiLeiI shiTiLei);

	// 对象：系统 （xiTong）
	public XiTongI getXiTong();
	public void setXiTong(XiTongI xiTong);

	
}