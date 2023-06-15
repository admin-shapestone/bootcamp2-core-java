package com.shapestone.compiletimepolymorphism;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("Addition of two integers: " + calculator.add(5, 10));
		System.out.println("Addition of two doubles: " + calculator.add(2.5, 3.7));
		System.out.println("Addition of three integers: " + calculator.add(2, 4, 6));
	}
}