package com.shapestone.string;

public class StringBufferMutable {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hi ");
		str.append("hello");
		System.out.println(str); // stringbuffer are mutable
		StringBuilder str1 = new StringBuilder("i am in hyderabad");// stringbuilder is also  are mutable
		str1.append("attending the java class");
		System.out.print(str1 + " ");

	}

}
