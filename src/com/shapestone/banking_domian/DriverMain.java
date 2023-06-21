package com.shapestone.banking_domian;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverMain {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		long totalBalance = 0;

		ObjectMapper mapper = new ObjectMapper();
		Driver1[] driver1 = mapper.readValue(new File("Accounts.json"), Driver1[].class);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-15s | %-15s|%n", "accountId", "name", "age", "gender",
				"dateOfJoining", "openingBalance");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < driver1.length; i++) {

			System.out.printf("| %-15s | %-15s | %-15s|  %-15s |  %-15s | %-15s|%n", driver1[i].getAccountId(),
					driver1[i].getName(), driver1[i].getAge(), driver1[i].getGender(), driver1[i].getDateOfJoining(),
					driver1[i].getOpeningBalance());

			totalBalance = (long) (totalBalance + driver1[i].getOpeningBalance());
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-30s | %-55s |%-15s| %n", " Total opening Balance", " ", totalBalance);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
	}

}
