package com.shapestone.oops.polymorphism;

public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingTest test = new OverLoadingTest();
		test.m1('A');
	}

	
	void m1(char ch) {
		System.out.println("i'm form m1 method with char" + ch);
	}

	void m1(byte b) {
		System.out.println("I'm from int type m1 method with int value " + b);
	}
	void m1(int i) {
		System.out.println("I'm from int type m1 method with int value " + i);
	}

	void m1(float f) {
		System.out.println("I'm from float type m1 method with float value " + f);
	}

}
