package com.shapestone.string;

public class CharAt {

	public static void main(String[] args) {
		int count = 0;
		String s = "we are from hyderabad";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("number of times reapting e is" + count);

	}
}
