package com.shapestone.stringstask3;

import java.util.Arrays;

public class InternExample {

	public static void main(String[] args) {
		String str1 = new String("shapestone");
		String str2 = str1.intern();
		String str3 = "shapestone";
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);

		// Example 2

		String s1 = "Javatpoint";
		String s2 = s1.intern();
		String s3 = new String("Javatpoint");
		String s4 = s3.intern();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);

	}

}
