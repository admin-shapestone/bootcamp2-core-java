package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {
	public void names(ArrayList<PatientPo> patientList, ArrayList<TreatmentPo> treatmentList) {
		System.out.println("------------------------------------------------------------------|");
		System.out.println("------------------------- PATIENTS DETAILS -----------------------|");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-15s|%15s|%-10s|%10s|%n", "Name", "Age", "Gender", "Id");
		System.out.println("------------------------------------------------------------------|");

		// Sort the patientList based on name using a custom comparator
		Collections.sort(patientList, new Comparator<PatientPo>() {
			public int compare(PatientPo p1, PatientPo p2) {
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
		});
		// Iterate over each patient and treatment to display the sorted data
		for (int i = 0; i < patientList.size(); i++) {
			PatientPo p = patientList.get(i);
			System.out.printf("|%-15s|%15s|%-10s|%10s|%n", p.getName(), p.getAge(), p.getGender(), p.getId());

			System.out.println("------------------------------------------------------------------|");

		}
	}
}
