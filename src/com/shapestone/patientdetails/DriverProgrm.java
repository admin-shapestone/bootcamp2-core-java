
package com.shapestone.patientdetails;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverProgrm {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option 1 to display the total amount of patients");
		System.out.println("Enter option 2 to get the list of patients who joined today and yesterday");
		System.out.println("Enter option 3 to get the sort by names");
		int option = sc.nextInt();

		ObjectMapper objectMapper = new ObjectMapper(); 
		 objectMapper.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));
		// Read patient data from JSON file
		ArrayList<PatientPo> patientList = objectMapper.readValue(
				DriverProgrm.class.getResourceAsStream("/com/shapestone/patientdetails/patients.json"),
				new TypeReference<ArrayList<PatientPo>>() {
				});
		
		// Read treatment data from JSON file
		ArrayList<TreatmentPo> treatmentList = objectMapper.readValue(
				DriverProgrm.class.getResourceAsStream("/com/shapestone/patientdetails/treatments.json"),
				new TypeReference<ArrayList<TreatmentPo>>() {
				});

		if (option == 1) {
			TotalAmount t = new TotalAmount();
			t.displayToatalAmount(patientList, treatmentList);

		} else if (option == 2) {
			JoinedTodayandYesterday ty = new JoinedTodayandYesterday();
			ty.todayandYesterday(patientList);
		} else if (option == 3) {
			SortNames s = new SortNames();
			s.names(patientList, treatmentList);
		} else {
			System.out.println("invalid option enter valid option");
		}
	}
	}

