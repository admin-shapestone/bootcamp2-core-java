package com.shapestone.oops;

public class EncapsulationExample2 {

	private int accountNumber;
	private double balance;

	void bankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	double getAmount() {
		return balance;
	}

	public void Deposite(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("amount deposite sucessfully  : " + balance);
		}
	}

	public void withDraw(double withDraw) {
		if (balance > withDraw) {
			balance = balance - withDraw;

			System.out.println("wuth draw successfully avaiable balance : " + balance);
		} else {
			System.out.println("in sufficent funds");
		}
	}
}
