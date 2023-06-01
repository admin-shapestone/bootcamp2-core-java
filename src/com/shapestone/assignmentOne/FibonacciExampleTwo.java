package com.shapestone.fibonacciseries;

public class FibonacciExampleTwo {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacciExampleTwo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			printFibonacciExampleTwo(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.println(n1 + " " + n2);
		printFibonacciExampleTwo(count - 2);

	}

}