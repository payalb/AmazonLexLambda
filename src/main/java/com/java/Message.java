package com.java;

public class Message {

	String contentType;
	String content;
	
	public Message(String string, String string2) {
		this.content= string2;
		this.contentType= string;
	}

	public Message(String contentType) {
		super();
		this.contentType = contentType;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
