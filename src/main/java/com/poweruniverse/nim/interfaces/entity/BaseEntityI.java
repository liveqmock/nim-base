package com.poweruniverse.nim.interfaces.entity;



public interface BaseEntityI {
	public Integer pkValue();
	public String pkName();
	public void pkNull();
	public BaseEntityI clone();

}
