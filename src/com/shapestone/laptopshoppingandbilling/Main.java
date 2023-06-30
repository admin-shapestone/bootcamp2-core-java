package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		System.out.println(
				"--------------------------------------------------------***Welcome To Laptop Purchase***----------------------------------------------------------------");
		System.out.println("Enter Option 1 For Laptops Purshased Today");
		System.out.println("Enter Option 2 For Customers Sorted BY Name.");
		System.out.println("Enter Option 3 For Total Payment By All The Customers");
		System.out.println("Enter Option 4 For Total Payments Of Every Customer");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.setDateFormat(new SimpleDateFormat("dd-mm-yyyy"));

		ArrayList<Customers> customers = new ArrayList<>();
		ArrayList<Purchases> purchases = new ArrayList<>();
		customers = objectMapper.readValue(new java.io.File("customers.json"),
				new TypeReference<ArrayList<Customers>>() {
				});
		purchases = objectMapper.readValue(new java.io.File("purchases.json"),
				new TypeReference<ArrayList<Purchases>>() {
				});
		PrintTotalPayment payment = new PrintTotalPayment();

		if (option == 1) {
			PurchasedTodayAndTomorrow laptopsToday = new PurchasedTodayAndTomorrow();
			laptopsToday.purchasedLaptopsToday(customers, purchases);
		} else if (option == 2) {
			CustomersSortedByName sortedByName = new CustomersSortedByName();
			sortedByName.customersSorted(customers, purchases);
		} else if (option == 3) {

			payment.printTotalPayment(customers, purchases);
		} else if (option == 4) {
			payment.customerTotalPurchases(customers, purchases);
		} else {
			System.out.println("Invalid Option...Choose Correct Option And Try Again.");
		}
	}

}