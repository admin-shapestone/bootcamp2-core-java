package com.shapestone.files;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentM {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		int sum=0;
		ObjectMapper object = new ObjectMapper();
		Student[] readvalue = object.readValue(new File("student.json"), Student[].class);
		System.out.printf(
				"------------------------------------------------------------STUDENT DETAILS--------------------------------------------------------%n");
		System.out.printf(
				"-----------------------------------------------------------------------------------------------------------------------------------%n");
		System.out.printf("| %15s | %15s | %15s | %50s| %n", "Name", "fathername", "mothername", "marks");
		System.out.printf("------------------------------------------------------------------------------------------------------------------------------------%n");
		for (int i = 0; i < readvalue.length; i++) {
			System.out.printf("| %15s | %15s | %15s |%50s| %n", readvalue[i].getName(), readvalue[i].getFathername(),
					readvalue[i].getMothername(), readvalue[i].getMarks());
		}
        System.out.printf("------------------------------------------------------------------------------------------------------------------------------------%n");


	}

}
