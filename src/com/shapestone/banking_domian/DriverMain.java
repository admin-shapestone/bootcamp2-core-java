package com.shapestone.banking_domian;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
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

		mapper.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));

		ArrayList<Payments> payments = new ArrayList<>();
		payments = mapper.readValue(new File("AllCostumerPayments.json"), new TypeReference<ArrayList<Payments>>() {
		});

		ArrayList<Accounts> driver1 = new ArrayList<>();

		driver1 = mapper.readValue(new File("Accounts.json"), new TypeReference<ArrayList<Accounts>>() {
		});

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for bank account holders details ");
		System.out.println("press 2 for total opening balance");

		System.out.println("press 3 for all account debits");

		System.out.println("press 4 for Total avaiable balance in bank");
		System.out.println("press 5 for all accounts open today");
		System.out.println("press 6 for all  account holders details in asscending order");
		AccountHolderData acount = new AccountHolderData();
		PaymentsData paymentsDetails = new PaymentsData();
		int choice = sc.nextInt();
		if (choice == 1) {

			acount.BankHolderDetails(driver1);

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
			List<Accounts> list = new ArrayList();
			for (int i = 0; i < driver1.size(); i++) {

				list.add(driver1.get(i));

			}
			System.out.println("----------------------------------------------------------------------");
			System.out.printf("|   %-25s |   %-20s |   %-10s |\n", "Account Holder Name", "Account Id", "Age");
			System.out.println("----------------------------------------------------------------------");
			Collections.sort(list, new BankAccountDetailsNameComparator());
			for (Accounts account : list) {
				System.out.printf("|   %-25s |   %-20s |   %-10s |\n", account.getName(), account.getAccountId(),
						account.getAge());
				System.out.println("----------------------------------------------------------------------");
			}

		}

		else {
			System.out.println("please select the correct option");
		}
	}

}
