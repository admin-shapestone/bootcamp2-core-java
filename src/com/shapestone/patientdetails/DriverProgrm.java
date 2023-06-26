
package com.shapestone.patientdetails;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverProgrm {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option 1 to display the total amount of patients");
		System.out.println("Enter option 2 to get the list of patients who joined today and yesterday");
		System.out.println("Enter option 3 to get the list of patients by alphabetical order");
		int option = sc.nextInt();

		ObjectMapper objectMapper = new ObjectMapper(); 
		// Read patient data from JSON file
		ArrayList<PatientP> patientList = objectMapper.readValue(
				DriverProgrm.class.getResourceAsStream("/com/shapestone/patientdetails/patients.json"),
				new TypeReference<ArrayList<PatientP>>() {
				});
		
		// Read treatment data from JSON file
		ArrayList<TreatmentP> treatmentList = objectMapper.readValue(
				DriverProgrm.class.getResourceAsStream("/com/shapestone/patientdetails/treatments.json"),
				new TypeReference<ArrayList<TreatmentP>>() {
				});

		if (option == 1) {
			TotalAmount t = new TotalAmount();
			t.DisplayToatalAmount(patientList, treatmentList);

		} else if (option == 2) {
			JoinedTodayandYesterday ty = new JoinedTodayandYesterday();
			ty.TodayandYesterday(patientList, treatmentList);
		} else if (option == 3) {
			SortNames s = new SortNames();
			s.Names(patientList, treatmentList);
		} else {
			System.out.println("invalid option enter valid option");
		}
	}
}
