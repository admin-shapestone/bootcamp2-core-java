package com.shapestone.strings;

public class EqualsExamples {

	public static void main(String[] args) {

		String s1 = "Devansh";
		String s2 = "Devansh";
		String s3 = new String("Devansh");
		String s4 = new String("Devansh");
		System.out.println(s1 == s4);// Addresses verified output false
		System.out.println(s1 == s2);// Addresses verified output true
		System.out.println(s3 == s4);// Addresses verified output
		System.out.println(s1.equals(s3));// use .equals data comparistion output is true

	}

}
