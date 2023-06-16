package com.shapestone.jsonfiles;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		EmployeeDetailes[] hello=om.readValue(new File ("employee.json"),EmployeeDetailes[].class);
         for(int i=0;i<=hello.length-1;i++)
         {
        	 System.out.println(hello[i].getEmployeName());
        	 System.out.println(hello[i].getId());
        	 System.out.println(hello[i].getDepartment());
        	 System.out.println(hello[i].getBloodGroup());
         }
	}}
