package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {
	public void Names(ArrayList<PatientP> patientList, ArrayList<TreatmentP> treatmentList) {
		System.out.println("------------------------------------------------------------------|");
		System.out.println("------------------------- PATIENTS DETAILS -----------------------|");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-15s|%15s|%-10s|%10s|%n", "Name", "Age", "Gender", "Id");
		System.out.println("------------------------------------------------------------------|");

		// Sort the patientList based on name using a custom comparator
		Collections.sort(patientList, new Comparator<PatientP>() {
			public int compare(PatientP p1, PatientP p2) {
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
		});
		// Iterate over each patient and treatment to display the sorted data
		for (int i = 0; i < patientList.size(); i++) {
			PatientP p = patientList.get(i);
			System.out.printf("|%-15s|%15s|%-10s|%10s|%n", p.getName(), p.getAge(), p.getGender(), p.getId());

			System.out.println("------------------------------------------------------------------|");

		}
	}
}
