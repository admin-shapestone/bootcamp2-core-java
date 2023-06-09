package com.shapestone.stringstask3;

public class ReverseString {

	public static void main(String[] args) {
		// String str = "shapestone";
		String str = new String("shapestone");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
