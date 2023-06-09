package com.shapestone.stringstask3;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Reverse each word in a String";
		String convert[] = str.split(" ");
		for (int i = convert.length - 1; i >= 0; i--) {
			System.out.print(convert[i] + " ");
		}
	}

}
