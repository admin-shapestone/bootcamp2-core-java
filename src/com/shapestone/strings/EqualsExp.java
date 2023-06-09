package com.shapestone.strings;

public class EqualsExp {

	public static void main(String[] args) {
		String s1 = "gabbarsingh";
		String s2 = "gabbarsingh";
		String s3 = "GABBARSINGH";
		String s4 = "Sardaar";
		System.out.println(s1.equals(s2));// true because content and case is same
		System.out.println(s1.equals(s3));// false because case is not same
		System.out.println(s1.equals(s4));// false because content is not same

	}

}
//compares the two given strings based on the content of the string. 
//If any character is not matched,it returns false.If all characters are matched,it returns true.