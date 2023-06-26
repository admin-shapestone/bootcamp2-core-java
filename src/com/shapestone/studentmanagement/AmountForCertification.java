package com.shapestone.studentmanagement;

import java.util.ArrayList;

public class AmountForCertification {
	public void Certificates(ArrayList<Certificates> certificatesList) {
		
	
	System.out.println(
			"---------------------------------------------------------------------------------------------------------|");
	System.out.printf("|%-15s |%-15s |%-15s |%-15s |%-15s|%n", "Slno", "StudentID", "Fees", "Certification",
			"DateOfJoining");

	System.out.println("------------------------------------------------------------------------------------|");

	

	for (int i = 0; i < certificatesList.size(); i++) {
		Certificates c = certificatesList.get(i);
		System.out.printf("|%-15s |%-15s |%-15s |%-15s |%-15s|%n ", c.getSlno(), c.getStudentId(), c.getFees(),
				c.getCertification(), c.getDateOfCertificationDone());
		System.out.println(
				"-----------------------------------------------------------------------------------|");

	}

}
}
