package com.redox.eims.data.service.model;

public class Data {
	

	private String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Data [message=" + message + "]";
	}
}
