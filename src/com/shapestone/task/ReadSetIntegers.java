package com.shapestone.task;

import java.util.Scanner;

public class ReadSetIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int oddsum = 0;
		int evensum = 0;

		do {
			System.out.print("Enter the number ");
			number = sc.nextInt();

			if (number % 2 == 0) {
				evensum = evensum + number;
			} else {
				oddsum = oddsum + number;
			}

			System.out.print("Do you want to continue y/n? ");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		System.out.println("Sum of even numbers: " + evensum);
		System.out.println("Sum of odd numbers: " + oddsum);
	}

}
