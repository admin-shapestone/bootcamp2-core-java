package com.shapestone.accessmodifiers;

public class StringExample {

	public static void main(String[] args) {
		
		 
		
		String str = "This is online classroom";
		
		String upperString = "NITHISH";
		String normalString = "nithish";
		String toUppperCase = normalString.toUpperCase();
		System.out.println(upperString + "  --  " + normalString + "  --  " + toUppperCase);
		System.out.println(upperString == toUppperCase);
		
		
		/*
		 * // classroom online is This String[] splittedArray = str.split(" "); for (int
		 * i=(splittedArray.length-1); i >= 0; i--) { System.out.print(splittedArray[i]
		 * + " "); }
		 * 
		 * String secondString = "NithiN"; // secondString.reverse(); for (int i=
		 * secondString.length() - 1; i>=0 ; i--) {
		 * System.out.print(secondString.charAt(i)); }
		 */

	}

}
