package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintTotalPayment {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		System.out.println(
				"--------------------------------------------------------***Welcome To Laptop Purchase***----------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Option 3 For Print Total Amount.");
		int option = scanner.nextInt();
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Customers> customers = new ArrayList<>();
		ArrayList<Purchases> purchases = new ArrayList<>();
		customers = objectMapper.readValue(new java.io.File("customers.json"),
				new TypeReference<ArrayList<Customers>>() {
				});
		purchases = objectMapper.readValue(new java.io.File("purchases.json"),
				new TypeReference<ArrayList<Purchases>>() {
				});
		if (option == 3) {
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("| %-15s | %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n", "S.NO",
					"Customer ID", "Name", "Age", "Gender", "Date Of Purchase", "Product ", "Price ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------");

			double totalAmount = 0.0;

			for (int i = 0; i < customers.size(); i++) {
				System.out.printf("| %-15s | %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n",
						customers.get(i).getsNo(), customers.get(i).getCustomerId(), customers.get(i).getName(),
						customers.get(i).getAge(), customers.get(i).getGender(), customers.get(i).getDateOfPurchase(),
						purchases.get(i).getProduct(), purchases.get(i).getPrice());
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------");

				totalAmount += purchases.get(i).getPrice();
			}
			System.out.println("Total Amount of Purchases: " + totalAmount);
		}
	}

}