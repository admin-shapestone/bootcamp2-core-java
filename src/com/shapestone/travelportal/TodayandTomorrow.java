package com.shapestone.travelportal;

import java.util.Date;
import java.util.Optional;
import java.util.ArrayList;

public class TodayandTomorrow {
	public void displayPassengerWhoIsTravellingTodayAndTomorrow(ArrayList<PassengerDetails> passengerList,
			ArrayList<BookingDetails> bookingList) {
		Date date = new Date();
		System.out.println(
				"`````````````````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", "Passenger Id", "Passenger Name", "Age", "Gender",
				"DateOfJourney");
		System.out.println(
				"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		// Iterate over amountList and check for passengers scheduled for today or
		// tomorrow
		for (BookingDetails booking : bookingList) {
			if (booking.getDateOfJourney().getDate() == date.getDate()
					|| booking.getDateOfJourney().getDate() == date.getDate() + 1) {
				Optional<PassengerDetails> passengerDetails = getPassengerDetails(booking.getPassengerId(),
						passengerList);
				PassengerDetails passenger = passengerDetails.get();
				System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", passenger.getPassengerId(),
						passenger.getPassengerName(), passenger.getAge(), passenger.getGender(),
						booking.getDateOfJourney());
				System.out.println(
						"````````````````````````````````````````````````````````````````````````````````````````````````````````````");
			}

		}
	}

	private Optional<PassengerDetails> getPassengerDetails(int passengerId, ArrayList<PassengerDetails> passengerList) {

		return passengerList.stream().filter(passenger -> passenger.getPassengerId() == passengerId).findAny();

	}
}