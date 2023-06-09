package com.shapestone.wrapperclasses;

public class ToStringExample {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);

		String s = i.toString();
		System.out.println(s);
		
		String s1 = Integer.toString(15, 2);
		System.out.println("the binary form of 15 is =  "+s1);
		
	}

}
