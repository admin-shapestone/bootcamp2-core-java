package com.shapestone.exception_handling;

public class ExceptionHandlingCases {

	public static void main(String[] args) {
		
	/*	//we will get compile time error because 
	 * between try and catch other statements are not allowed
*/		try 
		{
			System.out.println("from try block");
		}
		//System.out.println("other");
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
