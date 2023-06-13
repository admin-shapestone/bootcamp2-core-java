package com.shapestone.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String rev = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String n = sc.nextLine();
		for (int i = n.length() - 1; i >= 0; i--) {
			rev = rev + n.charAt(i);
		}
			if (n.equals(rev)) {
				System.out.println("it is a palimdrome ");
			} else {
				System.out.println("it is not a paindrome leter");
			}
		}
	
}
