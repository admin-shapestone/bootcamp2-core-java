package com.shapestone.overloadingexamplethree;

public class Overloading {
	void disp(int a, double b) {
		System.out.println("method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("method B");
	}

	public static void main(String[] args) {
		Overloading N = new Overloading();
		N.disp(100, 20.67f);
	}
}

/**
 * method A
 */