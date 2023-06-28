package com.shapestone.banking_domian;

import java.util.Date;

public class Payments {

	private int slNo;
	private long accountId;
	private String purposeOfPayment;
	private long amountPaid;
	private long amountRecieved;
	private Date dateOfPayment;

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

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

}
