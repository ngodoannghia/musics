package com.springboot.music.common;

public class AmazonResponse {
	private String message;
	private boolean status;
	
	public AmazonResponse(String message, boolean status) {
		this.message = message;
		this.status = status;
	}
	
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
