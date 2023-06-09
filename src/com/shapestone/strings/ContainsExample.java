package com.shapestone.strings;

public class ContainsExample {

	public static void main(String[] args) {
		String s1 = new String("Devansh");
		String s2 = new String("devansh");
		String s3 = new String("DEVANSH");
		System.out.println(s1.contains("De"));// using carrectors sequenses output :true
		System.out.println(s3.contains("de"));

	}

}
