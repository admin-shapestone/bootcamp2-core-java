package com.shapestone.flowcontrols;

public class IfExample {

	public static void main(String[] args) {

		int[] marks = { 0, 0, 0, 0, 99, 0 };
		
		
		float calculatePercentage = calculatePercentage(marks);
		
		if (calculatePercentage > 75) {
			System.out.println("A Grade");
		}
		else if (calculatePercentage > 60 && calculatePercentage < 75) {
			System.out.println("B Grade");
		}
		else if (calculatePercentage > 50 && calculatePercentage < 60) {
			System.out.println("C Grade");
		}
		else if (calculatePercentage > 35 && calculatePercentage < 50) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail.....");
		}

	}

	private static float calculatePercentage(int[] marks) {
		// sum of all subjects marks / no of subjects
		int sum =0;
		for (int i =0; i<6; i++) {
			sum = sum + marks[i];
		}
		
		
		float percentage = sum/6;
		System.out.println("Percentage :: " + percentage);
		return percentage;
	}

}
