package com.shapestone.methos;

public class MethodFlow {

	void m1() {
		System.out.println("this is from m1");
	}

	void m2() {
		m1();
		System.out.println("this is from m2");
	}

	void m3() {
		m2();
		System.out.println("this is from m3");
	}

	static void m4() {
		m5();
		System.out.println("this is from m4");
	}

	static void m5() {
		System.out.println("this is from m5");
	}

	public static void main(String[] args) {

		MethodFlow m = new MethodFlow();
		m.m3();
		m4();
	}

}
