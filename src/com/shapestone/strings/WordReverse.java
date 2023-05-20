package com.shapestone.strings;

public class WordReverse {

	public static void main(String[] args) {
		String str = "this is java class";

		String rev = "";
		String[] srr = str.split(" ");

		for (String arr : srr) {
			for (int i = arr.length() - 1; i >= 0; i--) {
				rev = rev + arr.charAt(i);
			}
		}

		System.out.println(  rev );

	}
}
