package com.java;

public class LexRequest {

	private String botName;
	private String intentName;
	private String productName;
	private int quantity;
	private String unit;
	private String error;
	public void setBotName(String botName) {
		this.botName= botName;
		
	}
	public String getBotName() {
		return botName;
	}
	public void setIntentName(String intentName) {
		this.intentName= intentName;
	}
	public String getIntentName() {
		return intentName;
	}
	public void setProductName(String string) {
		this.productName= string;
		
	}
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	

}
