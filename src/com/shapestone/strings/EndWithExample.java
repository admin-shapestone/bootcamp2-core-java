package com.shapestone.strings;

public class EndWithExample {

	public static void main(String[] args) {
		String s1 = "Devansh";
		String s2 = "devansh";
		String s3 = "DEVANSH";
		System.out.println(s1.endsWith("sh"));// letters verifie with ending output:true
		System.out.println(s3.endsWith("sh"));// false

	}

}
