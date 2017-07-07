package com.redox.eims.data.service.model;

public class ServiceResponse {
	

	private int status;
	private Errors errors;
	private Data data;

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public Errors getErrors() {
		return this.errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ServiceResponse [status=" + status + ", errors=" + errors + ", data=" + data + "]";
	}
}
