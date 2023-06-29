package com.shapestone.travelportal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class TravelAmount {

	public void calculateTotalPriceForEachPasenger(ArrayList<BookingDetails> bookingList,
			ArrayList<PassengerDetails> amountList) {

		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%-20s|%n", "Passenger ID", "Passenger Name", "Age",
				"Gender", "Date Of Journey", "TotalPrice");
		System.out.println(
				"................................................................................................................................");
		for (int i = 0; i < amountList.size(); i++) {
			PassengerDetails aa = amountList.get(i);

			System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s|%-20s|%n", aa.getPassengerId(), aa.getPassengerName(),
					aa.getAge(), aa.getGender(), aa.getDateOfJourney(), aa.getTotalPrice());

			System.out.println(
					"................................................................................................................................");

		}
	}

	public void printTotalTravelsForAllPassenger(ArrayList<BookingDetails> bookingList,
			ArrayList<PassengerDetails> amountList) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%n", "Sl no", "Passenger Id",
				"Orgin City", "Destination City", "Distance", "Mode of Transport", "Price per Km", "Total Balance");

		for (int i = 0; i < bookingList.size(); i++) {
			BookingDetails booking = bookingList.get(i);
			int id = booking.getPassengerId();
			booking.settotalTravelPrice(booking.getPricePerKm() * booking.getDistance());
			for (int j = 0; j < amountList.size(); j++) {
				if (amountList.get(j).getPassengerId() == id) {
					amountList.get(j).setTotalPrice(amountList.get(j).getTotalPrice() + booking.gettotalTravelPrice());
				}
			}

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s|%-20s|%n", booking.getSlNo(),
					booking.getPassengerId(), booking.getOriginCity(), booking.getDestinationCity(),
					booking.getDistance(), booking.getModeOfTransport(), booking.getPricePerKm(),
					booking.getPricePerKm() * booking.getDistance());
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}

	}

}
