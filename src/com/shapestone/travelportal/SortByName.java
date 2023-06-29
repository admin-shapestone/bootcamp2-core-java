package com.shapestone.travelportal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByName {

	public void printPassengerNamesInAssendingOrder(ArrayList<PassengerDetails> amountList) {
		System.out.println(
				"............................................................................................................");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", "PassengerId", "PassengerName", "Age", "Gender",
				"DateOfJourney");
		System.out.println(
				"............................................................................................................");
		// Sort the amountList by passenger name using a custom comparator
		Collections.sort(amountList, new Comparator<PassengerDetails>() {
			public int compare(PassengerDetails a1, PassengerDetails a2) {
				return a1.getPassengerName().compareTo(a2.getPassengerName());
			}
		});
		// Display passenger details in a table row
		for (int i = 0; i < amountList.size(); i++) {
			PassengerDetails aa = amountList.get(i);

			System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", aa.getPassengerId(), aa.getPassengerName(),
					aa.getAge(), aa.getGender(), aa.getDateOfJourney());

			System.out.println(
					"............................................................................................................");
		}

	}

}
