package com.rojatech.socialapp.avatar.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties("field1")
@JsonFilter("MessageFilter")
public class Message {
	
	private String field1;
	//@JsonIgnore
	private String password;
	private String field3;
	
	
	public Message(String field1, String password, String field3) {
		super();
		this.field1 = field1;
		this.password = password;
		this.field3 = field3;
	}
	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Override
	public String toString() {
		return "Message [field1=" + field1 + ", password=" + password + ", field3=" + field3 + "]";
	}
	
	
}
