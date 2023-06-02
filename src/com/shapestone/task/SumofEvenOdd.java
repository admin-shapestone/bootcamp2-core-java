package com.shapestone.task;

import java.util.Scanner;

public class SumofEvenOdd {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer value");
		int number = sc.nextInt();
		int evenSum = 0, oddSum = 0;
		
		while (number != 0) {
			int num = number % 10;

			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
			number = number / 10;

		}
		System.out.println("even sum = "+evenSum);
		System.out.println("odd sum = "+oddSum);

	}
}
