package com.shapestone.laptopshoppingandbilling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomersSortedByName {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		System.out.println(
				"--------------------------------------------------------***Welcome To Laptop Purchase***----------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Option 2 For Customers Sorted BY Name.");
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Customers> customers = new ArrayList<>();
		ArrayList<Purchases> purchases = new ArrayList<>();
		customers = objectMapper.readValue(new java.io.File("customers.json"),
				new TypeReference<ArrayList<Customers>>() {
				});
		purchases = objectMapper.readValue(new java.io.File("purchases.json"),
				new TypeReference<ArrayList<Purchases>>() {
				});
		int option = scanner.nextInt();
		if (option == 2) {

			System.out.println("------------------------------");
			System.out.printf("| %-10s | %-13s |%n", "S.No", "Customer Name");
			System.out.println("------------------------------");

			Collections.sort(customers, new Comparator<Customers>() {
				public int compare(Customers a1, Customers a2) {
					return a1.getName().compareTo(a2.getName());
				}
			});

			for (int i = 0; i < customers.size(); i++) {
				System.out.printf("| %-10s | %-13s |%n", customers.get(i).getsNo(), customers.get(i).getName());
				System.out.println("------------------------------");

			}
		}
	}
}