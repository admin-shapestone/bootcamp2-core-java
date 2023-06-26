package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {
	public void Names(ArrayList<PatientP> patientList, ArrayList<TreatmentP> treatmentList) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"------------------------------------------------- PATIENTS DETAILS -----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|%-10s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%n",
				"Serialno", "Name", "Age", "Gender", "Id", "Dateofadmission", "Treatment", "Diagnosis",
				"Dateoftraetment", "Doctorfee", "ScanningBill", "Medicine", "Totalamount");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Sort the patientList based on name using a custom comparator
		Collections.sort(patientList, new Comparator<PatientP>() {
			public int compare(PatientP p1, PatientP p2) {
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
		});
		  // Iterate over each patient and treatment to display the sorted data
		for (int i = 0; i < patientList.size(); i++) {
			PatientP pp = patientList.get(i);
			TreatmentP tt = treatmentList.get(i);
			int totalAmount = tt.getScanningBill() + tt.getMedicines() + tt.getDoctorfee();

			System.out.printf("|%15s|%-15s|%10s|%-10s|%15s|%-15s|%-15s|%-15s|%15s|%15s|%15s|%15s|%15s|%n",
					tt.getSerialno(), pp.getName(), pp.getAge(), pp.getGender(), pp.getId(), pp.getDateofadmission(),
					tt.getTreatment(), tt.getDiagnosis(), tt.getDateoftreatment(), tt.getDoctorfee(),
					tt.getScanningBill(), tt.getMedicines(), totalAmount);
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
