package com.shapestone.string;

import java.util.Scanner;

public class RemovingSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		String str1 = str.replaceAll("\\s+", "");

		System.out.println(str1);
		String s1 = str1.replace("java", " kava");

		System.out.println(s1 + " ");

		for (int i = str1.length() - 1; i >= 0; i--) {
			char str2 = str1.charAt(i);

			System.out.print(str2);

		}

	}

}
