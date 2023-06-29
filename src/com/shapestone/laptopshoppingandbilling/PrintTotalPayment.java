package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintTotalPayment {

	public void printTotalPayment(ArrayList<Customers> customers, ArrayList<Purchases> purchases) {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-7s | %-12s | %-17s | %-7s | %-9s | %-28s | %-15s | %-9s | %-8s |%n", "S.NO",
				"Customer ID", "Name", "Age", "Gender", "Date Of Purchase", "Product ", "Price", "Quantity");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------");

		double totalAmount = 0.0;

		for (int i = 0; i < customers.size(); i++) {
			System.out.printf("| %-7s | %-12s | %-17s | %-7s | %-9s | %-28s | %-15s | %-9s | %-8s |%n",
					purchases.get(i).getsNo(), customers.get(i).getCustomerId(), customers.get(i).getName(),
					customers.get(i).getAge(), customers.get(i).getGender(), purchases.get(i).getDateOfPurchase(),
					purchases.get(i).getProduct(), purchases.get(i).getPrice(), purchases.get(i).getQuantity());
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------");

			totalAmount += purchases.get(i).getPrice();
		}

		System.out.println("Total Amount of Purchases: " + totalAmount);
	}
}