package com.shapestone.banking_domian;

import java.util.ArrayList;

public class AllAcountPaymentsDetails {
	double sumOfAllDebits = 0;

	public void SumOfAllDebits(ArrayList<Payments> payments) {

		for (int j = 0; j < payments.size(); j++) {
			sumOfAllDebits = sumOfAllDebits + payments.get(j).getAmountPaid();
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");

		System.out.printf("| %-30s | %-55s |%-15s| %n", "Sum of all Account debits ", " ", sumOfAllDebits);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");

	}
}
