package com.shapestone.employeedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeCTC {
	public void calculateTotalCTCDrawn(ArrayList<Employee> employeeList, ArrayList<Company> companyList) {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n", "companyname", "amountreceived", "emailid", "id",
				"dateofreleving", "ctctimeofreleving");
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			int id = employee.getEmpId();
			Company company = getCompanyBasedOnEmployeeId(employee.getEmpId(), companyList);
			double ctctimeofreleving = calculateTotalCTCPerEmployee(id, companyList);
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%n", company.getCompanyName(), company.getAmountReceived(),
					company.getEmailId(), employee.getEmpId(), company.getDateOfReleving(), ctctimeofreleving);
		}
	}

	private Company getCompanyBasedOnEmployeeId(int empId, ArrayList<Company> companyList) {
		return companyList.stream().filter(company -> company.getEmpId() == empId).findAny().get();
	}

	private double calculateTotalCTCPerEmployee(int id, ArrayList<Company> companyList) {
		List<Company> ctctatotalamount = companyList.stream().filter(employee -> employee.getEmpId() == id)
				.collect(Collectors.toList());

		Double ctctimeofreleving = ctctatotalamount.stream()
				.collect(Collectors.summingDouble(Company::getCtcTimeOfReleving));

		return ctctimeofreleving;
	}
}
