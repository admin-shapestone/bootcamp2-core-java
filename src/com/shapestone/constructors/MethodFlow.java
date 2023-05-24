package com.shapestone.constructors;

public class MethodFlow {
	void m1() {
		m2();
		System.out.println("I am from m1 method");
	}

	private void m2() {
		m3();
		System.out.println("I am from m2 method");
	}

	private static void m3() {
		System.out.println("I am from m3 method");
	}

	private static void m4() {
		System.out.println("I am from m4 method");
	}

	public static void main(String[] args) {
		MethodFlow m = new MethodFlow();
		m.m1();
		m4();
	}
}