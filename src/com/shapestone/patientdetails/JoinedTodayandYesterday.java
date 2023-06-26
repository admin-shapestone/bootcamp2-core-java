package com.shapestone.patientdetails;

import java.util.ArrayList;

public class JoinedTodayandYesterday {
	public void TodayandYesterday(ArrayList<PatientP> patientList, ArrayList<TreatmentP> treatmentList) {
		String todaysDate = "23-6-2023";
		String yesterdayDate = "22-6-2023";
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

		for (int i = 0; i < patientList.size(); i++) {
			PatientP p = patientList.get(i);
			TreatmentP t = treatmentList.get(i);
			if (p.getDateofadmission().equals(todaysDate) || p.getDateofadmission().equals(yesterdayDate)) {

				int totalAmount = t.getScanningBill() + t.getMedicines() + t.getDoctorfee();
				System.out.printf("|%15s|%-15s|%10s|%-10s|%15s|%-15s|%-15s|%-15s|%15s|%15s|%15s|%15s|%15s|%n",
						t.getSerialno(), p.getName(), p.getAge(), p.getGender(), p.getId(), p.getDateofadmission(),
						t.getTreatment(), t.getDiagnosis(), t.getDateoftreatment(), t.getDoctorfee(),
						t.getScanningBill(), t.getMedicines(), totalAmount);
			}
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
