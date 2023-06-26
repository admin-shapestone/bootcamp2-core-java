package com.shapestone.laptopshoppingandbilling;

import java.util.ArrayList;

public class PurchasedLaptopsToday {

	public void purchasedLaptopsToday(ArrayList<Customers> customers, ArrayList<Purchases> purchases) {
		String todayPurchase = "2023-06-21";
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-15s | %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n", "S.NO", "Customer ID",
				"Name", "Age", "Gender", "Date Of Purchase", "Product ", "Price ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < customers.size(); i++) {
			if (todayPurchase.equals(customers.get(i).getDateOfPurchase())) {
				System.out.printf("| %-15s | %-17s | %-17s | %-17s | %-17s | %-17s | %-15s | %-9s |%n",
						customers.get(i).getsNo(), customers.get(i).getCustomerId(), customers.get(i).getName(),
						customers.get(i).getAge(), customers.get(i).getGender(), customers.get(i).getDateOfPurchase(),
						purchases.get(i).getProduct(), purchases.get(i).getPrice());
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
}