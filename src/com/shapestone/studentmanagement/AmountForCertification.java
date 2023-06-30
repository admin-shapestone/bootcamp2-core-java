package com.shapestone.studentmanagement;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AmountForCertification {
	public void Certificates(ArrayList<Certificates> certificatesList, ArrayList<Student> studentList) {

		System.out.println(
				"----------------------------------------------------|");
		System.out.printf("|%-15s |%-15s |%-15s  | %n", "Slno", "StudentID", "Fees");

		System.out.println("----------------------------------------------------|");
		HashMap psids = new HashMap();
		for (int i = 0; i < certificatesList.size(); i++) {
			Certificates c = certificatesList.get(i);
			int id = c.getStudentId();
			if (psids.get(id) == null) {
				psids.put(id, c);
			} else {
				continue;
			}

			double totalAmountForCertification = getTotalAmountForCertification(id, certificatesList);

			// System.out.println(totalAmountForCertification);

			System.out.printf("|%-15s |%-15s |%-15s  |%n ",  c.getSlno(),  c.getStudentId(),  totalAmountForCertification );
        System.out.println("---------------------------------------------------|");
		}
		
	}

	private double getTotalAmountForCertification(int id, ArrayList<Certificates> certificatesList) {
		List<Certificates> totalAmount = certificatesList.stream()
				.filter(certificate -> certificate.getStudentId() == id).collect(Collectors.toList());

		Double amountForCertification = totalAmount.stream().collect(Collectors.summingDouble(Certificates::getFee));
		return amountForCertification;

	}
}
