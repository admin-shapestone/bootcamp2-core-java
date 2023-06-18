package com.shapestone.fileoperations;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProgramOne {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Student[] student = mapper.readValue(new java.io.File("jsonfile1.json"), Student[].class);

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName());
			System.out.println(student[i].getCourse());
			System.out.println(student[i].getPhoneNumber());
		}

	}

}
