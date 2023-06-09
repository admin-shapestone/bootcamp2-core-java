package com.shapestone.strings;

public class StringContains {

	public static void main(String[] args) {
		String name = "what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("hello"));

	}

}
//searches the sequence of characters in this string. 
//It returns true if the sequence of char values is found in this string otherwise returns false.