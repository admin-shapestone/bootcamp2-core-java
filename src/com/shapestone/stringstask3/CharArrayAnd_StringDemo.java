package com.shapestone.stringstask3;

import java.util.Arrays;

public class CharArrayAnd_StringDemo {

	public static void main(String[] args) {

		char[] ch = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String("hello");
		String hellowString2 = new String("i am from hellow String 2");

		System.out.println(helloString);
		System.out.println(hellowString2);

		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length - 1; i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
