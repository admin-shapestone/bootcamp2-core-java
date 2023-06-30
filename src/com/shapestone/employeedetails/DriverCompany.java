package com.shapestone.employeedetails;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverCompany {
	private int slno;
	private String emailId;
	private String dateOfReleving;
	private int amountReceived;
	private String companyName;
	private String ctcTimeOfReleving;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfReleving() {
		return dateOfReleving;
	}
	public void setDateOfReleving(String dateOfReleving) {
		this.dateOfReleving = dateOfReleving;
	}
	public int getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(int amountReceived) {
		this.amountReceived = amountReceived;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCtcTimeOfReleving() {
		return ctcTimeOfReleving;
	}
	public void setCtcTimeOfReleving(String ctcTimeOfReleving) {
		this.ctcTimeOfReleving = ctcTimeOfReleving;
	}
	
}
