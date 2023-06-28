package com.shapestone.banking_domian;

import java.util.*;

public class AccountHolderData {
	double totalBalance = 0;
	double sumOfAllDebits = 0;
	Date date = new Date();

	public void BankHolderDetails(ArrayList<Accounts> driver1) {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-30s | %-15s|%n", "Account Id", "Name", "Age", "Gender",
				"Date Of Joining", "Opening Balance");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < driver1.size(); i++) {

			System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-30s | %-15s|%n", driver1.get(i).getAccountId(),
					driver1.get(i).getName(), driver1.get(i).getAge(), driver1.get(i).getGender(),
					driver1.get(i).getDateOfJoining(), driver1.get(i).getOpeningBalance());
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------");

		}

	}

	public void TotalOpeningBalance(ArrayList<Accounts> driver1) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < driver1.size(); i++) {
			totalBalance = totalBalance + driver1.get(i).getOpeningBalance();
		}
		System.out.printf("| %-30s | %-55s |%-15s| %n", " Total opening Balance", " ", totalBalance);
		System.out.println(

				"---------------------------------------------------------------------------------------------------------");

	}

	public void TotalAvaiableBalanceInBank(ArrayList<Accounts> driver1, ArrayList<Payments> payments) {
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

	@SuppressWarnings("unlikely-arg-type")
	public void TodayOpeningAccounts(ArrayList<Accounts> driver1) {

		System.out.println("-----------------------------------------------------------------------------------------");

		System.out.printf("| %-15s | %-15s | %-15s|  %-30s |%n", "accountId", "name", "age", "dateOfJoining");
		for (int i = 0; i < driver1.size(); i++) {
			if (driver1.get(i).getDateOfJoining().getDate() == date.getDate()) {

				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.printf("| %-15s | %-15s | %-15s|  %-30s |%n", driver1.get(i).getAccountId(),
						driver1.get(i).getName(), driver1.get(i).getAge(), driver1.get(i).getDateOfJoining());
				System.out.println(
						"------------------------------------------------------------------------------------------");
			}

		}
	}

}

class BankAccountDetailsNameComparator implements Comparator<Accounts> {

	@Override
	public int compare(Accounts o1, Accounts o2) {

		return o1.getName().compareTo(o2.getName());

	}
}
