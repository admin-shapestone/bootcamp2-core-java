package com.shapestone.travelportal;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Payment {
	public static void main(String... args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		Booking[] booking = om.readValue(new java.io.File("travel.json"), Booking[].class);
		TotalAmount[] amount = om.readValue(new java.io.File("travelportal.json"), TotalAmount[].class);
		for (int j = 0; j <= booking.length - 1; j++) {
			System.out.println("Sl No :" + booking[j].getSlNo());
			System.out.println("passengerId :" + booking[j].getPassengerId());
			System.out.println("Orgin City :" + booking[j].getOriginCity());
			System.out.println("Destination City:" + booking[j].getDestinationCity());
			System.out.println("Distance :" + booking[j].getDistance());
			System.out.println("Mode Of Transport :" + booking[j].getModeOfTransport());
			System.out.println("Price Per Km :" + booking[j].getPricePerKm());
			long totalBalance = booking[j].getPricePerKm() * booking[j].getDistance();
			System.out.println("TotalBalance :" + totalBalance);
			System.out.println("-----------------------------------------");
		}
		for (int i = 0; i <= amount.length - 1; i++) {
			System.out.println(amount[i].getPassengerId());
			System.out.println(amount[i].getPassengerName());
			System.out.println(amount[i].getAge());
			System.out.println(amount[i].getGender());
			System.out.println(amount[i].getDateOfJourney());
			System.out.println("-----------------------------------------");
		}

	}
}