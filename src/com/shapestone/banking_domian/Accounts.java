package com.shapestone.banking_domian;

import java.util.Date;

public class Accounts {

	private long accountId;
	private String name;
	private int age;
	private String gender;
	private Date dateOfJoining;
	private double openingBalance;



	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	@Override
	public String toString() {
		return "BankAccountHoldersDetails [accountId=" + accountId + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", dateOfJoining=" + dateOfJoining + ", openingBalance=" + openingBalance + "]";
	}

	
	

}
