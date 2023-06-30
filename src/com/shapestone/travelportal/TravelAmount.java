package com.shapestone.travelportal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class TravelAmount {

	public void calculateTotalPriceForEachPasenger(ArrayList<BookingDetails> bookingList,
			ArrayList<PassengerDetails> passengerList) {

		System.out.println("-----------------------------------------------------------------");
		System.out.printf("|%-20s| %-20s|%-20s|%n", "Passenger Id", "Passenger Name", "Total Cost");

		for (PassengerDetails passenger : passengerList) {
			int passengerId = passenger.getPassengerId();
			double totalPricePerPassenger = getTotalPricePerPassenger(passengerId, bookingList);
			System.out.println("-----------------------------------------------------------------");
			System.out.printf("|%-20s| %-20s|%-20s|%n", passenger.getPassengerId(), passenger.getPassengerName(),
					totalPricePerPassenger);
			System.out.println("-----------------------------------------------------------------");

		}

	}

	private double getTotalPricePerPassenger(int passengerId, ArrayList<BookingDetails> bookingList) {
		// TODO Auto-generated method stub
		List<BookingDetails> collect = bookingList.stream().filter(booking -> booking.getPassengerId() == passengerId)
				.collect(Collectors.toList());

		double total = 0;
		for (BookingDetails booking : collect) {
			double price = booking.getDistance() * booking.getPricePerKm();
			total = total + price;
		}
		return total;
	}

	public void printTotalTravelsForAllPassenger(ArrayList<BookingDetails> bookingList,
			ArrayList<PassengerDetails> passengerList) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%n", "Sl no", "Passenger Id",
				"Orgin City", "Destination City", "Distance", "Mode of Transport", "Price per Km", "Total Balance");

		for (BookingDetails booking : bookingList) {
			Optional<PassengerDetails> passengerDetails = getPassengerDetails(booking.getPassengerId(), passengerList);
//			PassengerDetails passenger = passengerDetails.get();

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s|%-20s|%n", booking.getSlNo(),
					booking.getPassengerId(), booking.getOriginCity(), booking.getDestinationCity(),
					booking.getDistance(), booking.getModeOfTransport(), booking.getPricePerKm(),
					booking.getPricePerKm() * booking.getDistance());
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}

		/*
		 * for (int i = 0; i < bookingList.size(); i++) { BookingDetails booking =
		 * bookingList.get(i); int id = booking.getPassengerId(); for (int j = 0; j <
		 * passengerList.size(); j++) { if (passengerList.get(j).getPassengerId() == id)
		 * { passengerList.get(j).setTotalPrice(passengerList.get(j).getTotalPrice() +
		 * booking.()); } }
		 * 
		 * System.out.println(
		 * "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
		 * );
		 * System.out.printf("|%-20s| %-20s|%-20s| %-20s|%-20s| %-20s|%-20s|%-20s|%n",
		 * booking.getSlNo(), booking.getPassengerId(), booking.getOriginCity(),
		 * booking.getDestinationCity(), booking.getDistance(),
		 * booking.getModeOfTransport(), booking.getPricePerKm(),
		 * booking.getPricePerKm() * booking.getDistance()); System.out.println(
		 * "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
		 * ); }
		 */

	}

	private Optional<PassengerDetails> getPassengerDetails(int passengerId, ArrayList<PassengerDetails> passengerList) {
		// TODO Auto-generated method stub
		return passengerList.stream().filter(passenger -> passenger.getPassengerId() == passengerId).findAny();

	}

}
