package com.shapestone.stringstask3;

public class DublicateWordsInAString {

	public static void main(String[] args) {
		String str1 = "shapestone";
		String str2 = "software";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
					System.out.println(ch1[i]);
				}
			}
		}

	}

}
