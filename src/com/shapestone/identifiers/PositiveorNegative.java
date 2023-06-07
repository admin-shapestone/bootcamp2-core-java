package com.shapestone.identifiers;

import java.util.Scanner;

public class PositiveorNegative {
		 public static void main(String[] args) {
		        int number;
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        number = scanner.nextInt();

		        if (number > 0) {
		            System.out.println("The number is positive.");
		        } else if (number < 0) {
		            System.out.println("The number is negative.");
		        } else {
		            System.out.println("The number is zero.");
		        }
		    }
	}


