package com.shapestone.flowcontrols;

import java.util.Date;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int noOfTimes =100;
		 * 
		 * while (noOfTimes > 0) { System.out.println(noOfTimes); noOfTimes--; }
		 */

		/*
		 * int startNumber = 1;
		 * 
		 * while (startNumber <= 100) { System.out.println(startNumber); startNumber++;
		 * }
		 */

		Date date = new Date();
		// This method returns the time in millis
		long timeMilli = date.getTime();
		System.out.println("Time in milliseconds using Date class: " + timeMilli);
		
		int startEvenNumber = 1; 
				
		while (startEvenNumber <= 0) {
			if (startEvenNumber % 2 == 0)
				System.out.println(startEvenNumber);
			startEvenNumber += 2; // statEvenNumber = startEvenNumber + 2
		}
		long timeMilli2 = new Date().getTime();
		System.out.println("Difference in milliseconds :: " + (timeMilli2-timeMilli));
	}

}
