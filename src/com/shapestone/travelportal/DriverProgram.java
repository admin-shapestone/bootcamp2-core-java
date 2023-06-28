package com.shapestone.travelportal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Scanner;

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
		System.out.println("Enter OPtion 1 For Toatal Total Amount Passenger has to Pay. ");
		System.out.println("Enter OPtion 2 Passengers Sorted by Name. ");
		System.out.println("Enter OPtion 3 For Passengers Scheduled For Today and Tomorrow. ");

		int option = sc.nextInt();
		// Create an ObjectMapper object to read JSON files
		ObjectMapper om = new ObjectMapper();
		om.setDateFormat(new SimpleDateFormat("dd-mm-yyyy"));
		// Create ArrayLists to store booking and amount data
		ArrayList<BookingDetails> bookingList = new ArrayList<>();
		ArrayList<PassengerDetails> amountList = new ArrayList<>();

		// Read booking data from "travel.json" file and deserialize it into bookingList
		bookingList = om.readValue(new java.io.File("travel.json"), new TypeReference<ArrayList<BookingDetails>>() {
		});
		// Read amount data from "passenger.json" file and deserialize it into
		// amountLIst
		amountList = om.readValue(new java.io.File("passenger.json"), new TypeReference<ArrayList<PassengerDetails>>() {
		});
		TravelAmount tm = new TravelAmount();
		// Option 1: Display total amount each passenger has to pay
		if (option == 1) {

			tm.amount(bookingList, amountList);

		}
		// Option 2: Display passengers sorted by name
		else if (option == 2) {
			SortByName s = new SortByName();
			s.sort(amountList);
			// Option 3: Display passengers scheduled for today and tomorrow
		} else if (option == 3) {
			TodayandTomorrow t = new TodayandTomorrow();
			t.today(amountList);
		}
	}
}
