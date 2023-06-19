package com.shapestone.strings;

public class ReverseString {
	public static void main(String[] args) {
		String R = "my name is phani rama";
		String[] r = R.split(" ");
		for (int i = r.length - 1; i >= 0; i--) {

			System.out.print(r[i] + " ");
		}
		System.out.println(" ");
		for (int i = R.length() - 1; i >= 0; i--) {
			char ch = R.charAt(i);
			System.out.print(ch);
		}
	}
}