package com.shapestone.overloadingexampletwo;

public class Overloading {
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
}