package com.shapestone.patientdetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PatientMain {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper om = new ObjectMapper();

		System.out.println(
				"-------------------------------------------------------------------------------PATIENTS DETAILS---------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%15s|%15s|%10s|%10s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n", "serialno", "Name",
				"Age", "Gender", "id", "dateofadmission", "treatment", "diagnosis", "dateoftraetment", "doctorfee",
				"scanningBill", "medicine", "totalamount");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		ArrayList<PatientP> patientList = om.readValue(new java.io.File(
				"C:\\Users\\91901\\projects\\bootcamp2-core-java\\src\\com\\shapestone\\patientdetails\\patients.json"),
				new TypeReference<ArrayList<PatientP>>() {
				});
		ArrayList<TreatmentP> treatmentList = om.readValue(new java.io.File(
				"C:\\Users\\91901\\projects\\bootcamp2-core-java\\src\\com\\shapestone\\patientdetails\\tratement.json"),
				new TypeReference<ArrayList<TreatmentP>>() {
				});

		for (int i = 0; i < patientList.size(); i++) {
			PatientP patient = patientList.get(i);
			TreatmentP treatment = treatmentList.get(i);
			int totalAmount = treatment.getScanningBill() + treatment.getMedicines() + treatment.getDoctorfee();
			System.out.printf("|%15s|%15s|%10s|%10s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n",
					treatment.getSerialno(), patient.getName(), patient.getAge(), patient.getGender(), patient.getId(),
					patient.getDateofadmission(), treatment.getTreatment(), treatment.getDiagnosis(),
					treatment.getDateoftreatment(), treatment.getDoctorfee(), treatment.getScanningBill(),
					treatment.getMedicines(), totalAmount);
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the id number");
	       String id=sc.nextLine();
	       for(int i=0;i<patientList.size();i++)
	       {
	       PatientP patient = patientList.get(i);
		   TreatmentP treatment = treatmentList.get(i);
           if( patient.getId().equals(id)){
	       System.out.println(patient.toString());
	       System.out.println(treatment.toString());
	       return; 
           }}
	     //  else
	       {
		       System.out.println("invalid patient id");}

	       
	
	       }
	       }   
	
	       
	
	
	
	
	
	
	
	
	
	
	

