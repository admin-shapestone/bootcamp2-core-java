package com.shapestone.fundamentals;

public class MaximumNumber {
	public static void main(String[] args) {
		int[] numbers = { 5, 10, 55, 15, 20, 25 };
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {

			if (max < numbers[i])
				max = numbers[i];
		}

		System.out.println(" maximum Number: " + max);

	}
}