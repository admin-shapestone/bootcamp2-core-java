package com.shapestone.studentmanagement;
import java.io.IOException;
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
    	String certificatedonebytoday="24-06-2023";
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 1 for sort the names");
        System.out.println("choose 2 for total amount for certification for students");
        System.out.println("choose 3 for certificate done by today");
        int choose = sc.nextInt();
        ObjectMapper om = new ObjectMapper();
        ArrayList<Student> studentList = om.readValue(new java.io.File("C:\\Users\\nages\\eclipse-workspace\\bootcamp2-core-java\\src\\student.json"), new TypeReference<ArrayList<Student>>() {});
        ArrayList<Certificates> certificatesList = om.readValue(new java.io.File("C:\\Users\\nages\\eclipse-workspace\\bootcamp2-core-java\\src\\certificates.json"), new TypeReference<ArrayList<Certificates>>() {});

        if (choose == 1) {
        	 System.out.println(
    				"---------------------------------------------------------------------------------------------------------|");
    		System.out.printf("|%-15s %-15s %-15s|%-15s| %-15s | %-15s |%n", "Student ID", "Student Name",
    				"StudentGender", "StudentAge", "StudentDateOfJoining", "StudentAddress");
    		System.out.println(     				"----------------------------------------------------------------------------------------------------------|");
            Collections.sort(studentList, new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return s1.getStudentName().compareToIgnoreCase(s2.getStudentName());
                }
            });

            for (Student student : studentList) {
                System.out.printf("|%-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%n",
                        student.getStudentId(), student.getStudentName(), student.getStudentGender(),
                        student.getStudentAge(), student.getStudentDateOfJoining(), student.getStudentAddress());
            
        }

        System.out.println(
				"---------------------------------------------------------------------------------------------------------|");
		System.out.printf("|%-15s %-15s %-15s|%-15s| %-15s | %-15s |%n", "Student ID", "Student Name",
				"StudentGender", "StudentAge", "StudentDateOfJoining", "StudentAddress");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------|");
    }
		else if(choose==2) {
        	 System.out.println("-----------------------------------------------------------------------------------------------------------|");
     		System.out.printf("|%-15s |%-15s |%-15s |%-15s |%-15s|%n", "Slno", "StudentID", "Fees", "Certification",
     				"DateOfJoining");

     		System.out.println("------------------------------------------------------------------------------------|");

		for (int j = 0; j <studentList.size(); j++) {
			Student s=studentList.get(j);
			System.out.printf(" |%-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%n", s.getStudentId(),
					s.getStudentName(), s.getStudentGender(), s.getStudentAge(),
					s.getStudentDateOfJoining(), s.getStudentAddress());
			System.out.println("-----------------------------------------------------------------------------------------------------------|");
			
			
		}
		
		for (int i = 0; i < certificatesList.size() ; i++) {
			Certificates c=certificatesList.get(i);
			System.out.printf("|%-15s |%-15s |%-15s |%-15s |%-15s|%n ",c.getSlno(),
					c.getStudentId(),c.getFees(),c.getCertification(),
					c.getDateOfCertificationDone());
			System.out.println("-----------------------------------------------------------------------------------|");

			
		}

	}
		else if(choose==3)
		{
			for(int j = 0; j <certificatesList.size(); j++) {
				Certificates c1=certificatesList.get(j);
				if(certificatedonebytoday.equals(c1.getDateOfCertificationDone()))
					
				{
					System.out.printf("|%-15s |%-15s |%-15s |%-15s |%-15s|%n ",c1.getSlno(),
							c1.getStudentId(),c1.getFees(),c1.getCertification(),
							c1.getDateOfCertificationDone());
					System.out.println("-----------------------------------------------------------------------------------|");

				}
		}
		}}}


