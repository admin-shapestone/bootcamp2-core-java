package com.shapestone.task;

import java.util.Scanner;

public class PlindormOrNot {

	public static void main(String[] args) {

		String original, reverse = ""; // Objects of String class
		Scanner inc1 = new Scanner(System.in);
		System.out.println("Enter a string/ *****to check if it is a palindrome");
		original = inc1.nextLine();
		for (int i =original.length() - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equalsIgnoreCase(reverse))
			System.out.println("Entered string/ *****is a palindrome.");
		else
			System.out.println("Entered string/ *****isn't a palindrome.");

	}

}
