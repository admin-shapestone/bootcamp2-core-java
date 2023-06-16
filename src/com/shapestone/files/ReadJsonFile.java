package com.shapestone.files;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFile {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		Student[] readValue = om.readValue(new File("studentjsonfile.json"), Student[].class);

		System.out.printf("| %-15s | %-15s | %-15s | %-90s |%n", "name", "course", "phone number",
				"                                             address");
		System.out.printf("------------------------------------------------------------------------------------"
				+ "--------------------------------------------------------------%n");

		for (int i = 0; i < readValue.length; i++) {

			// System.out.println(readValue[i].getAddress());
			System.out.printf("| %-15s | %-15s | %-15s | %-88s|%n", readValue[i].getName(), readValue[i].getCourse(),
					readValue[i].getPhoneNumber(), readValue[i].getAddress());

		}
		System.out.println("----------------------------------------------------------------------------------------"
				+ "--------------------------------------------------------");

	}
}
/*
 * Address[] readValue1 = om.readValue(new File("studentjsonfile.json"),
 * Address[].class);
 */

/*
 * for (int j = 0; j < readValue1.length; j++) {
 * System.out.println(readValue[i].getLine());
 * System.out.println(readValue[i].getDistrict());
 * System.out.println(readValue[i].getMandal());
 * System.out.println(readValue[i].getPincode());
 * System.out.println(readValue[i].getVillage()); }
 * 
 */
