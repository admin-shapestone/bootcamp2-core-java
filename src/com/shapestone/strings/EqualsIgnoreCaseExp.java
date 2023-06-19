package com.shapestone.strings;

public class EqualsIgnoreCaseExp {

	public static void main(String[] args) {
		String s1 = "Gabbarsingh";
		String s2 = "gabbarsingh";
		String s3 = "GABBARSINGH";
		String s4 = "Sardaar";
		System.out.println(s1.equalsIgnoreCase(s2));// true because content and case both are same
		System.out.println(s1.equalsIgnoreCase(s3));// true because case is ignored
		System.out.println(s1.equalsIgnoreCase(s4));// false because content is not same

	}

}
//compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string. 
//It is just like the equals() method but doesn't check the case sensitivity. 
//If any character is not matched, it returns false, else returns true.