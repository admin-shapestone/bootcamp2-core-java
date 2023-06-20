package com.shapestone.arrays;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		int[]numbers = {5, 10, 2, 8, 3};
		int sum = calculateSum(numbers);
		
		System.out.println("The sum of the numbers is: "+sum);
	}

	private static int calculateSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
			
		}
		
		return sum;
	}

}
