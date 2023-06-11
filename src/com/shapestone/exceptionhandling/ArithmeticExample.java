package com.shapestone.exceptionhandling;

public class ArithmeticExample {

	public static void main(String[] args) {
		System.out.println("Arithimatic axecution start");
		
		int fNumber = 8;
		int sNumber =0;
		int result = 0 ;
		
		
		try {
			result = fNumber/sNumber;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());	
		}
		finally {
			System.out.println("finally block");
		}
		
		
		System.out.println("output is:"+result);
		System.out.println("output end");
		
		

	}

}
