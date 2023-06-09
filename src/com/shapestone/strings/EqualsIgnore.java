package com.shapestone.strings;

public class EqualsIgnore {

	public static void main(String[] args) {
		String s1 = "Devansh";
		String s2 = "DeVansh";
		String s3 = "devansh";
		System.out.println(s1.equals(s2));// Data comparition with two identifiers output is false
		System.out.println(s1.equalsIgnoreCase(s2));// only data verify case not mandatary output is true
	}

}
