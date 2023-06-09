package com.shapestone.stringstask3;

public class CompareToExample {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "jello";
		String str4 = "heljo";
		String str5 = "";
		String str6 = "jello";
		String st1 = new String("SHAPESTONE");
		String st2 = new String("shapestone");

		System.out.println(str1.compareTo(str2));// it return 0 both the strings are equal
		System.out.println(str1.compareTo(str3));// its return -2 because h is 2 times lower than that j
		System.out.println(str1.compareTo(str4));// it return 2 because because l is two times greathFerthan j.
		System.out.println(str1.compareTo(str5));// it return 5 in positive.
		System.out.println(str5.compareTo(str6));// return 5 in negative.
		System.out.println(st1.compareToIgnoreCase(st2));// Ignores the case sensitive.
		
		
	}
}
