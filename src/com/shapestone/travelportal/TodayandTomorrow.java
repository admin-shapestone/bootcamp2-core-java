package com.shapestone.travelportal;

import java.util.Date;

import java.util.ArrayList;

public class TodayandTomorrow {
	public void today(ArrayList<PassengerDetails> amountList) {
		Date date = new Date();
		System.out.println(
				"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", "PassengerId", "PassengerName", "Age", "Gender",
				"DateOfJourney");
		System.out.println(
				"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		// Iterate over amountList and check for passengers scheduled for today or
		// tomorrow
		for (int i = 0; i < amountList.size(); i++) {
			PassengerDetails a = amountList.get(i);
			if (amountList.get(i).getDateOfJourney().getDate() == date.getDate()
					|| amountList.get(i).getDateOfJourney().getDate() == date.getDate() + 1) {
				// if (a.getDateOfJourney().equals(Todaydate) ||
				// a.getDateOfJourney().equals(Tomorrowdate)) {
				// Display passenger details in a table row
				System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", a.getPassengerId(), a.getPassengerName(),
						a.getAge(), a.getGender(), a.getDateOfJourney());
				System.out.println(
						"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
			}

		}
	}
}