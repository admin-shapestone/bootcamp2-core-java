package com.shapestone.employeedetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {

	public void Sort(ArrayList<Employee>employeeList) {
	System.out.println(
			"---------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", "name", "Id", "Age", "Gender",
			"Phone Number", "Address", "DateofJoining");
	System.out.println(
			"-----------------------------------------------------------------------------------------------------------------------------------------------------");

	Collections.sort(employeeList, new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	});

	for (Employee employee : employeeList) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", employee.getName(), employee.getId(),
				employee.getAge(), employee.getGender(), employee.getPhoneNumber(), employee.getAddress(),
				employee.getDateOfJoining());
	}
}}
