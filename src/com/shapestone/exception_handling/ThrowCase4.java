package com.shapestone.exception_handling;

public class ThrowCase4 {

	public static void main(String[] args) {

		System.out.println(10 / 0);//RC : ArithmeticException
		System.out.println("hello");
		
		/*
		 * throw new ArithmeticException(); System.out.println("hello"); //CE : Because
		 * we are passing exception explicitly.
		 */	}

}
