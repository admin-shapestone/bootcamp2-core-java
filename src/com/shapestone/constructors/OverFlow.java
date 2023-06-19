package com.shapestone.constructors;

public class OverFlow {
	void m1() {
		m2();
		System.out.println("I am from m1 method");
	}

	private void m2() {
		m3();
		System.out.println("I am from m2 method");
	}

	private static void m3() {
		m4();
		System.out.println("I am from m3 method");
	}

	private static void m4() {
		m3();
		System.out.println("I am from m4 method");
	}

	public static void main(String[] args) {
		OverFlow f = new OverFlow();
		f.m1();
		m4();
	}
}