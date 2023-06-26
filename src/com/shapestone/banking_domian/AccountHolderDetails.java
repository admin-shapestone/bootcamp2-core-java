package com.shapestone.banking_domian;

import java.util.*;

public class AccountHolderDetails {
	double totalBalance = 0;
	double sumOfAllDebits = 0;

	public void displayTotalAmount(ArrayList<BankAccountHoldersDetails> driver1) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-15s | %-15s|%n", "accountId", "name", "age", "gender",
				"dateOfJoining", "openingBalance");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < driver1.size(); i++) {

			System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-15s | %-15s|%n", driver1.get(i).getAccountId(),
					driver1.get(i).getName(), driver1.get(i).getAge(), driver1.get(i).getGender(),
					driver1.get(i).getDateOfJoining(), driver1.get(i).getOpeningBalance());
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------");

		}

	}

	public void TotalOpeningBalance(ArrayList<BankAccountHoldersDetails> driver1) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < driver1.size(); i++) {
			totalBalance = totalBalance + driver1.get(i).getOpeningBalance();
		}
		System.out.printf("| %-30s | %-55s |%-15s| %n", " Total opening Balance", " ", totalBalance);
		System.out.println(

				"-------------------------------------------------------------------------------------------------------------");

	}

	public void TotalAvaiableBalanceInBank(ArrayList<BankAccountHoldersDetails> driver1, ArrayList<Payments> payments) {
		for (int i = 0; i < driver1.size(); i++) {
			totalBalance = totalBalance + driver1.get(i).getOpeningBalance();

		}
		for (int j = 0; j < payments.size(); j++)

		{
			sumOfAllDebits = sumOfAllDebits + payments.get(j).getAmountPaid();
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-30s | %-55s |%-15s| %n", "Total avaiable balance in bank", " ",
				totalBalance - sumOfAllDebits);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
	}

	public void TodayOpeningAccounts(ArrayList<BankAccountHoldersDetails> driver1) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("| %-15s | %-15s | %-15s|  %-15s |%n", "accountId", "name", "age", "dateOfJoining");
		for (int i = 0; i < driver1.size(); i++) {
			if (driver1.get(i).getDateOfJoining().equals("8-20-2023")) {

				System.out.println("--------------------------------------------------------------------------");
				System.out.printf("| %-15s | %-15s | %-15s|  %-15s |%n", driver1.get(i).getAccountId(),
						driver1.get(i).getName(), driver1.get(i).getAge(), driver1.get(i).getDateOfJoining());
				System.out.println("--------------------------------------------------------------------------");
			}
		}

	}

	public class BankAccountDetailsNameComparator implements Comparator<BankAccountHoldersDetails> {

		@Override
		public int compare(BankAccountHoldersDetails o1, BankAccountHoldersDetails o2) {

			return o1.getName().compareTo(o2.getName());

		}
	}

}
