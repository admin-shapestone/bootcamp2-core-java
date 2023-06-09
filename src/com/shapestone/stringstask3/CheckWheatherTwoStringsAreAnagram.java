package com.shapestone.stringstask3;

import java.util.Arrays;

public class CheckWheatherTwoStringsAreAnagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("its a anagram");
		} else {
			System.out.println("not an anagram");
		}
	}

}
