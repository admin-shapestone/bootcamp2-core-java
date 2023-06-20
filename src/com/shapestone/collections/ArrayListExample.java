package com.shapestone.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(10);
		Collections.sort(list);
		System.out.println(list);

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");
		stringList.add("Four");
		stringList.add("Five");
		stringList.add(null);

		Collections.sort(stringList);
		System.out.println(stringList);

		/*
		 * ArrayList<Employee> empList = new ArrayList<>();
		 * 
		 * empList.add(new Employee("Nagesh", 11)); empList.add(new Employee("Abhilash",
		 * 12)); empList.add(new Employee("Gopi", 13)); empList.add(new Employee("Gopi",
		 * 2)); empList.add(new Employee("Nithish", 14)); empList.add(new
		 * Employee("Akshay", 15));
		 * 
		 * empList.add(new Employee("Akshay", 16)); empList.add(new Employee("Akshay",
		 * 1));
		 * 
		 * empList.add(null); empList.add(null); empList.add(null);
		 * 
		 * // if sort based on price
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("1) for sort employess based on name");
		 * System.out.println("2) for sort employess based on id"); int input =
		 * scan.nextInt(); if (input == 1) { Collections.sort(empList);
		 * 
		 * } else if (input == 2) { Collections.sort(empList); } else {
		 * System.out.println("Worng input selected, displaying default order"); }
		 */
		

//		System.out.println(empList);

	}
}
