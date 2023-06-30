package com.shapestone.employeedetails;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Companyp {
	public static Object get;
	private int slno;
	private String emailId;
	private String dateOfReleving;
	private int amountReceived;
	private String companyName;
	private double ctcTimeOfReleving;
	public void setCtcTimeOfReleving(double ctcTimeOfReleving) {
		this.ctcTimeOfReleving = ctcTimeOfReleving;
	}
	public int getSlno() {
		return slno;
	}
	@Override
	public String toString() {
		return "Companyp [slno=" + slno + ", emailId=" + emailId + ", dateOfReleving=" + dateOfReleving
				+ ", amountReceived=" + amountReceived + ", companyName=" + companyName + ", ctcTimeOfReleving="
				+ ctcTimeOfReleving + "]";
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
	public static Object getGet() {
		return get;
	}
	public static void setGet(Object get) {
		Companyp.get = get;
	}
	public double getCtcTimeOfReleving() {
		return ctcTimeOfReleving;
	}
	
	}
	
	

