package com.shapestone.overloadingexampleone;

public class Overloading {
	void demo(int a) {
		System.out.println("a: " + a);
	}

	void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}

	double demo(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}
