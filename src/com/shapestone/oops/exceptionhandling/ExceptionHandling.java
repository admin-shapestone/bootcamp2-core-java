package com.shapestone.oops.exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number1");
		int input1 = scanner.nextInt();
		
		System.out.print("Enter any number2");
		
		File f = new File("C:\\Users\\surya\\OneDrive\\Desktop\\demo.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int input2 = scanner.nextInt();
		
		ThrowsUsageDemo demo = new ThrowsUsageDemo();
		try {
			demo.divideByZero(input1, input2);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getLocalizedMessage());
			throw new CustomException("Nithish don't want to have second argument as zero");
		}
		
		
		System.out.println("No issue with above lines of program....");
//		throw new CustomException("Divisible with zero is not permitted");
	}

}
