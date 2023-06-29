package com.shapestone.patientdetails;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class JoinedTodayYesterday {
	public void todayYesterday(ArrayList<PatientPo> patientList) {
		// accessing the patientList and treatmentList from the main class

		Date date = new Date();
		System.out.println("-----------------------------------------------------------------------------------|");
		System.out.println("----------------------------------- PATIENTS DETAILS ------------------------------|");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%15s|%-10s|%10s|%10s|%n", "Name", "Age", "Gender", "Id", "Dateofadmission");
		System.out.println("-----------------------------------------------------------------------------------|");

		for (int i = 0; i < patientList.size(); i++) {
			PatientPo p = patientList.get(i);

			if (date.getDate() == p.getDateofadmission().getDate()
					|| date.getDate() - 1 == p.getDateofadmission().getDate()) {

				System.out.printf("|%-15s|%15s|%-10s|%10s|%15s|%n", p.getName(), p.getAge(), p.getGender(), p.getId(),
						p.getDateofadmission());

			}
		}

		System.out.println("-----------------------------------------------------------------------------------|");
	}

}
