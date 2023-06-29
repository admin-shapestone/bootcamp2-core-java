package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TotalAmount {
	public void displayToatalAmount(ArrayList<PatientPojo> patientList, ArrayList<TreatmentPojo> treatmentList) {

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
			PatientPojo patient = patientList.get(i);
			int id = patient.getId();
			double totalCostForPatient = getTotalCostForPatient(id,treatmentList);
			System.out.printf("|%15s|%-15s|%-10s|%-10s|%15s|%n",
					patient.getId(), patient.getName(), patient.getAge(), patient.getGender(),  totalCostForPatient);
		}
		System.out.println(
				"-------------------------------------------------------------------------");
	}

	private int getTotalCostForPatient(int id, ArrayList<TreatmentPojo> treatmentList) {
		List<TreatmentPojo> treatmentsById = treatmentList.stream().filter(treatment -> treatment.getPatientId() == id).collect(Collectors.toList());
				
		Integer medicinCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentPojo::getMedicines));

		Integer doctorCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentPojo::getDoctorfee));

		Integer scanningCost = treatmentsById.stream().collect(Collectors.summingInt(TreatmentPojo::getScanningBill));
		return medicinCost + doctorCost + scanningCost;
	}
}
