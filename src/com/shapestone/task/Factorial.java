package com.shapestone.task;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int fact = 1;

		System.out.print("Enter any positive integer: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial: " + fact);
	}

}

//The factorial of a number is the multiplication of all the numbers between 1 and the number itself.
