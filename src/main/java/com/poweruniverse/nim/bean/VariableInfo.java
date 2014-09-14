package com.poweruniverse.nim.bean;

/**
 * 系统参数
 * @author Administrator
 *
 */
public class VariableInfo {

	// 属性：参数代号 （code）
	private java.lang.String code = null;
	// 属性：参数值 （value）
	private java.lang.String value = null;
	// 属性：参数说明 （comments）
	private java.lang.String comments = null;
	// 属性：参数说明 （required）
	private java.lang.String required = null;

	public VariableInfo(String code, String value, String comments,String required) {
		super();
		this.code = code;
		this.value = value;
		this.comments = comments;
		this.required = required;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getValue() {
		return value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getComments() {
		return comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	public java.lang.String getRequired() {
		return required;
	}

	public void setRequired(java.lang.String required) {
		this.required = required;
	}
	
			
}
