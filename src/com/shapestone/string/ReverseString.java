package com.shapestone.string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "my name is akshay kumar";
		String[] str = s.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");

		}
		System.out.println(" ");
		String std = "akshay";
		for (int i = std.length() - 1; i >= 0; i--) {
			char ch = std.charAt(i);
			System.out.print(ch);
		}
		System.out.println(" ");
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch1 = s.charAt(i);
			System.out.print(ch1);

		}
	}
}
