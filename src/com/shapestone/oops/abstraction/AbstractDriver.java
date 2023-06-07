package com.shapestone.oops.abstraction;

public class AbstractDriver extends AbstractDemo {

	public AbstractDriver() {

		super(1000);
		System.out.println("I'm from parametarised constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDriver abstractDriver = new AbstractDriver();
		abstractDriver.m1();

	}

	@Override
	void m1() {
		System.out.println("M1...");
		System.out.println("I value from parent class is :: " + i);

	}

}
