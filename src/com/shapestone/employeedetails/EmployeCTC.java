package com.shapestone.employeedetails;

import java.util.ArrayList;
import java.util.List;

public class EmployeCTC {
	public void Empctc(ArrayList<Employee> employeeList,ArrayList<Companyp> companyList) {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", "name", "Id", "Age", "Gender",
				"Phone Number", "Address", "DateofJoining");
		for (Employee employee : employeeList) {
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n", employee.getName(), employee.getId(),
					employee.getAge(), employee.getGender(), employee.getPhoneNumber(), employee.getAddress(),
					employee.getDateOfJoining());
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n", "companyname", "amountreceived", "emailid",
				"slno", "dateofreleving", "ctctimeofreleving");
		for (Companyp company : companyList) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n", company.getCompanyName(),
					company.getAmountReceived(), company.getEmailId(), company.getSlno(),
					company.getDateOfReleving(), company.getCtcTimeOfReleving());
	}

}
}
