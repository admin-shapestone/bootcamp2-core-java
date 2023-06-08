package com.shapestone.stringstask3;

public class StringMethods {

	public static void main(String[] args) {

		String str = "shapestone";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.concat("solution"));
		System.out.println(str.replaceAll(str, "rock"));
		System.out.println(str.contains("shape"));
		String joinString1=String.join("-","welcome","to","shapestone");  
		System.out.println(joinString1);  
		} 
	}


