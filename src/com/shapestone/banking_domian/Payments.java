package com.shapestone.banking_domian;

public class Payments {

	private int slNo;
	private long accountId;
	private String purposeOfPayment;
	private long amountPaid;
	private long amountRecieved;
	private String dateOfPayment;
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getPurposeOfPayment() {
		return purposeOfPayment;
	}
	public void setPurposeOfPayment(String purposeOfPayment) {
		this.purposeOfPayment = purposeOfPayment;
	}
	public long getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(long amountPaid) {
		this.amountPaid = amountPaid;
	}
	public long getAmountRecieved() {
		return amountRecieved;
	}
	public void setAmountRecieved(long amountRecieved) {
		this.amountRecieved = amountRecieved;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	
	
}
