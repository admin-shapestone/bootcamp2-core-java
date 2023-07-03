package com.shapestone.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class CertificationToday {
	public void Certificates(ArrayList<Certificates> certificatesList) {
		Date date = new Date();

		for (int j = 0; j < certificatesList.size(); j++) {
			Certificates s = certificatesList.get(j);
			if (date.getDate() == s.getDateOfCertificationDone().getDate()) {
				System.out.println("-----------------------------------------------------|");

				System.out.printf(" |%-15s | %-15s|%n", s.getStudentId(), s.getDateOfCertificationDone());
				System.out.println("-----------------------------------------------------|");

			}
		}
	}
}
