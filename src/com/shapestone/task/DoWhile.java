package com.shapestone.task;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int number1, number2, num = 0, sum;
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter number one value");
			number1 = sc.nextInt();
			System.out.println("enter number two value");
			number2 = sc.nextInt();
			sum = number1 + number2;
			System.out.println(sum);
			System.out.println("do you want to continue y/n?");
			choice = sc.next().charAt(0);
			System.out.println(" ");
		} while (choice == 'y' || choice == 'Y');
		
	}}

