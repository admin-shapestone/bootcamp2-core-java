package com.shapestone.strings;

public class Practice {

	public static void main(String[] args) {
		String str = "Nitish";
		System.out.println(str);
		String str1 = new String("Nagesh");
		System.out.println(str1);
		char[] str3 = { 'R', 'a', 'm', 'a', +'a' };
		System.out.println(str3);
		char[] str4 = { 'G', 'o', 'p', 'i' };
		System.out.println(str4);
		byte[] bt = { 65, 66, 67, 68, 69, 70 };
		String str5 = new String(bt);
		System.out.println(str5);
		byte[] bt1 = { 70, 69, 68, 67, 66, 65 };
		String str6 = new String(bt1);
		System.out.println(str6);

	}

}
//String is used to represent group of characters or character array enclosed with in the double quotes.