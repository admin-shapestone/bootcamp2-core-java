package com.shapestone.travelportal;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverProgram {
	public static void main(String... args) throws StreamReadException, DatabindException, IOException {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"..........................................................***WELCOME TO TRAVEL PORTAL***.....................................................................................");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		// Display options for the user to choose from
		System.out.println("Enter OPtion 1 for Toatal amount passenger has to pay. ");
		System.out.println("Enter OPtion 2 for Passengers sorted by name. ");
		System.out.println("Enter OPtion 3 for Passengers scheduled for today and tomorrow. ");
		System.out.println("Enter OPtion 4 for Total travels for all passengers. ");

		int option = sc.nextInt();
		// Create an ObjectMapper object to read JSON files
		ObjectMapper om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		om.setDateFormat(new SimpleDateFormat("dd-mm-yyyy"));
		// Create ArrayLists to store booking and amount data
		ArrayList<BookingDetails> bookingList = new ArrayList<>();
		ArrayList<PassengerDetails> passengerList = new ArrayList<>();

		// Read booking data from "travel.json" file and deserialize it into bookingList
		bookingList = om.readValue(new java.io.File("travel.json"), new TypeReference<ArrayList<BookingDetails>>() {
		});
		// Read amount data from "passenger.json" file and deserialize it into
		// amountLIst
		passengerList = om.readValue(new java.io.File("passenger.json"),
				new TypeReference<ArrayList<PassengerDetails>>() {
				});
		TravelAmount tm = new TravelAmount();
		// Option 1: Display total amount each passenger has to pay
		if (option == 1) {

			tm.calculateTotalPriceForEachPasenger(bookingList, passengerList);

		}
		// Option 2: Display passengers sorted by name
		else if (option == 2) {
			SortByName s = new SortByName();
			s.printPassengerNamesInAssendingOrder(passengerList);
			// Option 3: Display passengers scheduled for today and tomorrow
		} else if (option == 3) {
			TodayandTomorrow t = new TodayandTomorrow();
			t.displayPassengerWhoIsTravellingTodayAndTomorrow(passengerList, bookingList);
		} else if (option == 4) {
			tm.printTotalTravelsForAllPassenger(bookingList, passengerList);
		} else {
			System.out.println("Invalid option selected ....Please try again :)");
		}
	}
}
