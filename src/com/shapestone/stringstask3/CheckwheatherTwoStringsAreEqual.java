package com.shapestone.stringstask3;

public class CheckwheatherTwoStringsAreEqual {

	public static void main(String[] args) {
		String str1 = "shapestone";
		String str2 = "shapestone";
		boolean status = true;

		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					status = true;
				} else {
					status = false;
				}
			}
		} else {

			status = false;
		}
		if (status == true) {
			System.out.println("both the strings are equal");
		} else {
			System.out.println("both are not equal");

		}

	}
}
/*
 * if(str1.equals(str2)) { System.out.println("both are equal"); } else {
 * System.out.println("not equal"); }
 */
