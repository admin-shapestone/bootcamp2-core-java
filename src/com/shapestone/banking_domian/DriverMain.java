package com.shapestone.banking_domian;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		ArrayList<Payments> payments = new ArrayList<>();
		payments = mapper.readValue(new File("AllCostumerPayments.json"), new TypeReference<ArrayList<Payments>>() {
		});

		ArrayList<BankAccountHoldersDetails> driver1 = new ArrayList<>();

		driver1 = mapper.readValue(new File("Accounts.json"),
				new TypeReference<ArrayList<BankAccountHoldersDetails>>() {
				});

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for bank account holders details ");
		System.out.println("press 2 for total opening balance");

		System.out.println("press 3 for all account debits");

		System.out.println("press 4 for Total avaiable balance in bank");
		System.out.println("press 5 for all accounts open today");
		System.out.println("press 6 for all  account holders details in asscending order");
		AccountHolderDetails acount = new AccountHolderDetails();
		AllAcountPaymentsDetails paymentsDetails = new AllAcountPaymentsDetails();
		int choice = sc.nextInt();
		if (choice == 1) {

			acount.displayTotalAmount(driver1);

		}

		else if (choice == 2) {
			acount.TotalOpeningBalance(driver1);

		} else if (choice == 3) {
			paymentsDetails.SumOfAllDebits(payments);

		}

		else if (choice == 4) {

			acount.TotalAvaiableBalanceInBank(driver1, payments);

		} else if (choice == 5) {
			acount.TodayOpeningAccounts(driver1);

		}

		else if (choice == 6) {
			List list = new ArrayList();
			for (int i = 0; i < driver1.size(); i++) {

				list.add(driver1.get(i));

			}

			Collections.sort(list, new BankAccountDetailsNameComparator());
			System.out.println(list);

		}

		else {
			System.out.println("please select the correct option");
		}
	}

}
