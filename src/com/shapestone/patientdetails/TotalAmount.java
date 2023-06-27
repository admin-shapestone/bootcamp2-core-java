package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TotalAmount {
	public void displayToatalAmount(ArrayList<PatientP> patientList, ArrayList<TreatmentP> treatmentList) {

		System.out.println(
				"-----------------------------------------------------------------------");
		System.out.println(
			"------------------------------ PATIENTS DETAILS --------------------------");
		System.out.println(
			"--------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|%-10s|%-15s|%n",
				"Id", "Name", "Age", "Gender",  "Totalamount");
		System.out.println(
				"--------------------------------------------------------------------");

		// Iterate over each patient and treatment to calculate and display the total
		// amount
		for (int i = 0; i < patientList.size(); i++) {
			PatientP patient = patientList.get(i);
			int id = patient.getId();
			int totalCostForPatient = getTotalCostForPatient(id,treatmentList);
			
//			TreatmentP treatment = treatmentList.get(i);
//			int totalAmount = treatment.getScanningBill() + treatment.getMedicines() + treatment.getDoctorfee();
			// prnting in the table format
			System.out.printf("|%15s|%-15s|%-10s|%-10s|%15s|%n",
					patient.getId(), patient.getName(), patient.getAge(), patient.getGender(),  totalCostForPatient);
		}
		System.out.println(
				"-------------------------------------------------------------------------");
	}

	private int getTotalCostForPatient(int id, ArrayList<TreatmentP> treatmentList) {
		List<TreatmentP> treatmentsById = treatmentList.stream().filter(treatment -> treatment.getPatientId() == id).collect(Collectors.toList());
				
		Integer medicinCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentP::getMedicines));

		Integer doctorCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentP::getDoctorfee));

		Integer scanningCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentP::getScanningBill));
		return medicinCost + doctorCost + scanningCost;
	}
}
