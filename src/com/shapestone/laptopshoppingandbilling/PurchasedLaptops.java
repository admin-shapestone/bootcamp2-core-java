package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PurchasedLaptops {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper purchase = new ObjectMapper();
		Customers[] customer = purchase.readValue(new java.io.File("customers.json"), Customers[].class);
		Purchases[] today = purchase.readValue(new java.io.File("purchases.json"), Purchases[].class);
		String todayPurchase = "2023-06-21";
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n", "Customer ID", "Name", "Age", "Gender",
				"Date Of Purchase", "Product ", "Price ");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i <= customer.length - 1; i++)
			if (todayPurchase.equals(customer[i].getDateOfPurchase())) {
				System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n", customer[i].getCustomerId(),
						customer[i].getName(), customer[i].getAge(), customer[i].getGender(),
						customer[i].getDateOfPurchase(),today[i].getProduct(),today[i].getPrice());

			}

	}
}