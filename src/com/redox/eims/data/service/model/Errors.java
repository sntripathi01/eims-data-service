package com.redox.eims.data.service.model;

public class Errors {
	private String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Errors [message=" + message + "]";
	}
}
