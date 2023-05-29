package com.shapestone.task1;

public class Print1To100PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 2; i <= 100; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count = 1;
					break;
				}
			}

			if (count == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
