package com.shapestone.strings;

public class IsEmptyExample {

	public static void main(String[] args) {
		String s1;
		String s2 = "  ";
		String s3 = "";
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s2.isBlank());
	}

}
