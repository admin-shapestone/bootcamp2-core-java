package com.shapestone.patientdetails;

import java.util.ArrayList;

public class TotalAmount {
	public void DisplayToatalAmount(ArrayList<PatientP> patientList, ArrayList<TreatmentP> treatmentList) {

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

        // Iterate over each patient and treatment to calculate and display the total amount
		for (int i = 0; i < patientList.size(); i++) {
			PatientP patient = patientList.get(i);
			TreatmentP treatment = treatmentList.get(i);
			int totalAmount = treatment.getScanningBill() + treatment.getMedicines() + treatment.getDoctorfee();
			//prnting in the table format
			System.out.printf("|%15s|%-15s|%-10s|%-10s|%15s|%15s|%-15s|%-15s|%15s|%15s|%15s|%15s|%15s|%n",
					treatment.getSerialno(), patient.getName(), patient.getAge(), patient.getGender(), patient.getId(),
					patient.getDateofadmission(), treatment.getTreatment(), treatment.getDiagnosis(),
					treatment.getDateoftreatment(), treatment.getDoctorfee(), treatment.getScanningBill(),
					treatment.getMedicines(), totalAmount);
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
