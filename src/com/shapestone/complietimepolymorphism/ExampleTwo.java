package com.shapestone.complietimepolymorphism;

public class ExampleTwo {
	public static void main(String... args) {
		ExampleTwo sc = new ExampleTwo();
		sc.m1(10.0);
	}
	static void m1(float x) {
		System.out.println("float number");
	}
	static void m1(int x) {
		System.out.println("int number");
	}
	static void m1(double x) {
		System.out.println("double number");
	}

}