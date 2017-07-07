package com.redox.eims.data.service.model;

public class Library {
	private String SchoolRegistrationNumber;
	private String employeeNumber;
	private String accountNo;
	private String issueDate;
	private String dueDate;
	private String returnDate;
	private String issueRemark;
	private String fine;

	public String getSchoolRegistrationNumber() {
		return this.SchoolRegistrationNumber;
	}

	public void setSchoolRegistrationNumber(String SchoolRegistrationNumber) {
		this.SchoolRegistrationNumber = SchoolRegistrationNumber;
	}

	public String getEmployeeNumber() {
		return this.employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getIssueRemark() {
		return this.issueRemark;
	}

	public void setIssueRemark(String issueRemark) {
		this.issueRemark = issueRemark;
	}

	public String getFine() {
		return this.fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	@Override
	public String toString() {
		return "Library [SchoolRegistrationNumber=" + SchoolRegistrationNumber + ", employeeNumber=" + employeeNumber
				+ ", accountNo=" + accountNo + ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", returnDate="
				+ returnDate + ", issueRemark=" + issueRemark + ", fine=" + fine + "]";
	}

}