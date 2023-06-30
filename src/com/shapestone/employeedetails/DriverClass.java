package com.shapestone.employeedetails;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverClass {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		System.out.println(
				"------------------------------------------****Welcome To  Employee Details****-------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("option 1 for print the total ctc drawn");
		System.out.println("option 2 for print employees joined today");
		System.out.println("option 3 print names sort by names");
		int option = sc.nextInt();
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Employee> employeeList = (ArrayList<Employee>) mapper.readValue(new java.io.File("employee.json"),
				new TypeReference<List<Employee>>() {
				});
		ArrayList<Companyp> companyList = (ArrayList<Companyp>) mapper.readValue(new java.io.File("company.json"),
				new TypeReference<List<Companyp>>() {
				});

		if (option == 1) {
			EmployeCTC emp = new EmployeCTC();
			emp.Empctc(employeeList, companyList);
		}

		else if (option == 2) {
			JoinedToday j = new JoinedToday();
			j.Today(employeeList);
		} else if (option == 3) {
			SortNames s = new SortNames();
			s.Sort(employeeList);
		} else {
			System.out.println("Invalid Option Choose Correct Option And Try Again");
		}
	}

}
