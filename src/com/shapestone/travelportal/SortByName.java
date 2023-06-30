package com.shapestone.travelportal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByName {

	public void printPassengerNamesInAssendingOrder(ArrayList<PassengerDetails> passengerList) {
		System.out.println(
				".......................................................................................");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%n", "PassengerId", "PassengerName", "Age", "Gender");
		System.out.println(
				".......................................................................................");
		// Sort the amountList by passenger name using a custom comparator
		Collections.sort(passengerList, new Comparator<PassengerDetails>() {
			public int compare(PassengerDetails a1, PassengerDetails a2) {
				return a1.getPassengerName().compareTo(a2.getPassengerName());
			}
		});
		// Display passenger details in a table row
		for (int i = 0; i < passengerList.size(); i++) {
			PassengerDetails aa = passengerList.get(i);

			System.out.printf("|%-20s| %-20s|%-20s| %-20s|%n", aa.getPassengerId(), aa.getPassengerName(), aa.getAge(),
					aa.getGender());

			System.out.println(
					"......................................................................................");
		}

	}

}
