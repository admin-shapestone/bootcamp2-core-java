package com.shapestone.task1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstNum = 0, secondNum = 1;
		int sum = 0;
		System.out.print(firstNum + " " + secondNum);

		for (int i = 1; i <= 20; i++) {
			sum = firstNum + secondNum;
			System.out.print(" " + sum);

			firstNum = secondNum;
			secondNum = sum;
		}

	}

}
