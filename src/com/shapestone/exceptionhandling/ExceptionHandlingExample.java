package com.shapestone.exceptionhandling;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println(result);
		} catch (ArithmeticException a) {
			System.out.println("Arthmetic exception occured: " + a.getMessage());
		} finally {
			System.out.println("Finally block ececuted. ");
		}
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
}
