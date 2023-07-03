package com.shapestone.studentmanagement;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class StudentManagement {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("choose 1 for sort the names");
		System.out.println("choose 2 for total amount for certification for students");
		System.out.println("choose 3 for certificate done by today");
		int choose = sc.nextInt();
		ObjectMapper om = new ObjectMapper();
		om.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));
		ArrayList<Student> studentList = om.readValue(
				new java.io.File("C:\\Users\\nages\\eclipse-workspace\\bootcamp2-core-java\\src\\student.json"),
				new TypeReference<ArrayList<Student>>() {
				});
		ArrayList<Certificates> certificatesList = om.readValue(
				new java.io.File("C:\\Users\\nages\\eclipse-workspace\\bootcamp2-core-java\\src\\certificates.json"),
				new TypeReference<ArrayList<Certificates>>() {
				});

		if (choose == 1) {
			SortingByName sort = new SortingByName();

			sort.Sort(studentList);
		} else if (choose == 2) {

			CertificationTotalAmount ac = new CertificationTotalAmount();
			ac.Certificates(certificatesList, studentList);

		} else if (choose == 3) {
			CertificationToday today = new CertificationToday();
			today.Certificates(certificatesList);
		} else {
			System.out.println("invaid number please enter correct number");
		}

	}
}