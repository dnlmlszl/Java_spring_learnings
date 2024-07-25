package com.lmdlearning.webservices.restful_web_services.helloworld;

public class HelloWorldBean {
	
	private String message;
	private String anotherMessage;

	public HelloWorldBean(String message, String anotherMessage) {
		super();
		this.message = message;
		this.anotherMessage = anotherMessage;
	}

	public String getAnotherMessage() {
		return anotherMessage;
	}

	public void setAnotherMessage(String anotherMessage) {
		this.anotherMessage = anotherMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", anotherMessage=" + anotherMessage + "]";
	}



}
