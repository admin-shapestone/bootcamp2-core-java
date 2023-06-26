package com.shapestone.travelportal;

import java.util.ArrayList;

public class TravelAmount {
	public void Amount(ArrayList<Booking> bookingList,ArrayList<TotalAmount> amountList) {
	System.out.println(
			"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%n", "Sl no", "Passenger Id",
			"Orgin City", "Destination City", "Distance", "Mode of Transport", "Price per Km", "Total Balance");
	// Iterate over bookingList and calculate total balance for each booking
	for (Booking booking : bookingList) {
		long totalBalance = booking.getPricePerKm() * booking.getDistance();
		// Display booking details in a table row
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%n", booking.getSlNo(),
				booking.getPassengerId(), booking.getOriginCity(), booking.getDestinationCity(),
				booking.getDistance(), booking.getModeOfTransport(), booking.getPricePerKm(), totalBalance);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	// Display booking details in a table row
	System.out.println(
			"------------------------------------------------------------------------------------------------------------");
	// Display passenger details in a table
	for (TotalAmount totalAmount : amountList) {
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%n", totalAmount.getPassengerId(),
				totalAmount.getPassengerName(), totalAmount.getAge(), totalAmount.getGender(),
				totalAmount.getDateOfJourney());
	}
	// Display a separator
	System.out.println(
			"------------------------------------------------------------------------------------------------------------");
}
}
