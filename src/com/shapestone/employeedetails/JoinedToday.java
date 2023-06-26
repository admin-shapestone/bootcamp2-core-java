package com.shapestone.employeedetails;

import java.util.ArrayList;
import java.util.List;

public class JoinedToday {
	public void Today(ArrayList<Employee> employeeList) {
		String todayJoined = "23-06-2023";
	
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", "name", "Id", "Age", "Gender",
				"Phone Number", "Address", "DateofJoining");
		for (int i = 0; i < employeeList.size(); i++) {
			Employee e = employeeList.get(i);
			if (e.getDateOfJoining().equals(todayJoined)) {
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", e.getName(), e.getId(),
						e.getAge(), e.getGender(), e.getPhoneNumber(), e.getAddress(), e.getDateOfJoining());
			}
	}
	}
}
