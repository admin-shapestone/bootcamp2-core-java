package com.shapestone.stringstask3;

public class DifferentMethodsInString {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		// or String s= new String ("GeeksforGeeks");

		System.out.println("String length = " + s.length());// 13

		// Returns the character at ith index.
		System.out.println("Character at 3rd position = " + s.charAt(3));// k

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));// ksforGeeks

		System.out.println("Substring = " + s.substring(2, 5));// eks

		// s1 concation with s2
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string = " + s1.concat(s2));// GeeksforGeeks

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));// 6

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a = " + s4.indexOf('a', 3));// 8

		// Checking equality of Strings
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality " + out);// false
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality " + out);// true

		out = "Geeks".equalsIgnoreCase("gEeks ");
		System.out.println("Checking Equality" + out);// false

		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2" + out);// -1

		// Converting cases
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());// geekyme

		// Converting cases
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + word1.toUpperCase());// GEEKYME

		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());// It remove 1st space and last space

		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f', 'g');// geeksgorgeeks

		System.out.println("Replaced f with g -> " + str2);
	}

}
