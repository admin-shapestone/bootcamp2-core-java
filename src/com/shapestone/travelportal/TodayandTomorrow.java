package com.shapestone.travelportal;

import java.util.ArrayList;

public class TodayandTomorrow {
	public void Today(ArrayList<TotalAmount> amountList) {
		String Todaydate = "24-06-2023";
		String Tomorrowdate = "25-06-2023";
		System.out.println(
				"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", "PassengerId", "PassengerName", "Age", "Gender",
				"DateOfJourney");
		System.out.println(
				"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		// Iterate over amountList and check for passengers scheduled for today or
		// tomorrow
		for (int i = 0; i < amountList.size(); i++) {
			TotalAmount a = amountList.get(i);
			if (a.getDateOfJourney().equals(Todaydate) || a.getDateOfJourney().equals(Tomorrowdate)) {
				// Display passenger details in a table row
				System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", a.getPassengerId(), a.getPassengerName(),
						a.getAge(), a.getGender(), a.getDateOfJourney());
				System.out.println(
						"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
			}

		}
	}
}
