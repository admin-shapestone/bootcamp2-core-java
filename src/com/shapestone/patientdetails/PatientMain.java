package com.shapestone.patientdetails;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PatientMain {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		int totalamount = 1;
		ObjectMapper om = new ObjectMapper();
		PatientPojo[] arr = om.readValue(new java.io.File(
				"C:\\Users\\91901\\projects\\bootcamp2-core-java\\src\\com\\shapestone\\patientdetails\\patients.json"),
				PatientPojo[].class);
		TreatmentPojo[] trr = om.readValue(new java.io.File(
				"C:\\Users\\91901\\projects\\bootcamp2-core-java\\src\\com\\shapestone\\patientdetails\\tratement.json"),
				TreatmentPojo[].class);

		System.out.println(
				"-------------------------------------------------------------------------------PATIENTS DETAILS---------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%15s|%15s|%10s|%10s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n", "serialno", "Name",
				"Age", "Gender", "id", "dateofadmission", "treatment", "diagnosis", "dateoftraetment", "doctorfee",
				"scanningBill", "medicine", "totalamount");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			int totalAmount = trr[i].getScanningBill() + trr[i].getMedicines() + trr[i].getDoctorfee();
			System.out.printf("|%15s|%15s|%10s|%10s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n",
					trr[i].getSerialno(), arr[i].getName(), arr[i].getAge(), arr[i].getGender(), arr[i].getId(),
					arr[i].getDateofadmission(), trr[i].getTreatment(), trr[i].getDiagnosis(),
					trr[i].getDateoftreatment(), trr[i].getDoctorfee(), trr[i].getScanningBill(), trr[i].getMedicines(),
					totalAmount);
		}

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
