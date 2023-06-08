package com.shapestone.strings;

public class ConcatExample {
	public static void main(String[] args) {
		String str1 = "Phani";
		String str2 = "Sri";
		String str3 = "Rama";

		// concatenating one string

		String str4 = str1.concat(str2);
		System.out.println(str4);

		// concatenating multiple string

		String str5 = str1.concat(str2).concat(str3);
		System.out.println(str5);
	}
}
