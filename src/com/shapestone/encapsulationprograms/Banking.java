package com.shapestone.encapsulationprograms;

public class Banking {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit successful ");
		} else {
			System.out.println("Invalid deposit amount ");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawal successful!");
		} else {
			System.out.println("Invalid withdrawal amount!");
		}
	}

	public static void main(String[] args) {
		Banking account = new Banking();
		account.deposit(10000);
		account.withdraw(500);

		System.out.println("Balance: " + account.getBalance());
	}
}