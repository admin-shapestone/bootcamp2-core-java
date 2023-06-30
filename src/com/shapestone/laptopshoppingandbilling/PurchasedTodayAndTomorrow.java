package com.shapestone.laptopshoppingandbilling;

import java.util.ArrayList;
import java.util.Date;

public class PurchasedTodayAndTomorrow {
	Date date = new Date();

	public void purchasedLaptopsToday(ArrayList<Customers> customers, ArrayList<Purchases> purchases) {

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-7s | %-15s | %-17s | %-7s | %-10s | %-28s | %-15s | %-9s | %-10s |%n", "S.NO", "Customer ID",
				"Name", "Age", "Gender", "Date Of Purchase", "Product ", "Price ", "Quantity ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < customers.size(); i++) {
			if (purchases.get(i).getDateOfPurchase().getDate() == date.getDate()  || purchases.get(i).getDateOfPurchase().getDate() == date.getDate()+1  ) {
				System.out.printf("| %-7s | %-15s | %-17s | %-7s | %-10s | %-28s | %-15s | %-9s | %-10s |%n",
						purchases.get(i).getsNo(), customers.get(i).getCustomerId(), customers.get(i).getName(),
						customers.get(i).getAge(), customers.get(i).getGender(),purchases.get(i).getDateOfPurchase(),
						purchases.get(i).getProduct(), purchases.get(i).getPrice(), purchases.get(i).getQuantity());
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
}