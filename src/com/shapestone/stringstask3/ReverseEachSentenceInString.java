package com.shapestone.stringstask3;

public class ReverseEachSentenceInString {

	public static void main(String[] args) {
		String str = "Reverse each sentence in A string";
		String convert[] = str.split(" ");
		for (String reverse : convert) {
			for (int i = reverse.length() - 1; i >= 0; i--) {
				System.out.print(reverse.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
