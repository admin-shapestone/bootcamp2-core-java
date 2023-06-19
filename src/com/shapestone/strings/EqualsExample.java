package com.shapestone.strings;

public class EqualsExample {
	public static void main(String[] args) {
		String s1 = "corejava";
		String s2 = "corejava";
		String s3 = "javacore";
		System.out.println(s1.equals(s2));
		if (s1.equals(s3)) {
			System.out.println("both strings are equal");
		} else
			System.out.println("both strings are unequal");
	}
}
