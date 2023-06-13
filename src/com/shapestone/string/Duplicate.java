package com.shapestone.string;

public class Duplicate {

	public static void main(String[] args) {
		int count = 0;
		String str = "hi hello";
		char[] ch = str.toCharArray();
		System.out.println("Duplictes elements  are");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i] + " ");
					count++;
					break;
				}

			}
		}
	}
}
