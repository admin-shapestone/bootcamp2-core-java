package com.shapestone.methos;

public class StackOverFlowExample {

	void m1() {
		m2();
		System.out.println("from m1");
	}

	void m2() {
		m1();
		System.out.println("from m2");
	}

	public static void main(String[] args) {

		StackOverFlowExample s = new StackOverFlowExample();
		s.m1();

	}

}
