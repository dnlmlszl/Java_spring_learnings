package com.lmdlearning.learning.spring.framework.test;

import java.io.Serializable;

// Plain old java object
class  Pojo {
	
	private String text;
	
	private int number;
	
	public String toString() {
		return text + ": " + number;
	}
}

class JavaBean implements Serializable {
	// 3. Implements Serializable
	private static final long serialVersionUID = 1L;
	
	private String text;
	
	private int number;	
	
	//1. public no-arg constructor
	public JavaBean() {};	

	// 2. getters and setters
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

public class SpringBeanVsJavaBean {	
	

	public static void main(String[] args) {
		
		Pojo pojo = new Pojo();
		
		System.out.println(pojo);

	}

}
