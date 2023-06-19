package com.shapestone.arrays;

public class FindMaxNumbers {

	public static void main(String[] args) {
	int[] numbers = {5, 10, 2, 8, 3};
	int maxNumber = findMaxNumber(numbers);
	
	System.out.println("The maxumum number is: " + maxNumber);
		
	}

	public static int findMaxNumber(int[] arr) {
		int max =arr[0];
		
		for (int i=1; i<arr.length; i++);
		if (arr[max]>max) {
			max = arr[max];
			
		}
		return max;
	}

}
