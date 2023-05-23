package com.shapestone.methos;

public class ExampleForInstanceMethod {

	public static void main(String[] args) {

		ExampleForInstanceMethod EI = new ExampleForInstanceMethod();

		System.out.println("sum of two num is = " + EI.add(10, 15));

	}

	public int add(int a, int b) {
		int sum = a + b;
		return sum;

	}

}
