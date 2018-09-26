package com.java;

public class DialogAction {

	String type;
	String fulfillmentState;
	Message message;
	public DialogAction(String type, String fulfillmentState, Message myMessage) {
		this.type= type;
		this.fulfillmentState= fulfillmentState;
		this.message= myMessage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFulfillmentState() {
		return fulfillmentState;
	}
	public void setFulfillmentState(String fulfillmentState) {
		this.fulfillmentState = fulfillmentState;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

}
