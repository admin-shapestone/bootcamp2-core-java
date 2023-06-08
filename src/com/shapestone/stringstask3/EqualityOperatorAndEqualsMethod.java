package com.shapestone.stringstask3;

public class EqualityOperatorAndEqualsMethod {

	public static void main(String[] args) {
		String str1 = new String("shape");
		String str2 = new String("shape");

		String str3 = "shape";
		String str4 = "shape";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));

		StringBuffer sb1 = new StringBuffer("shape");
		StringBuffer sb2 = new StringBuffer("shape");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

	}

}
