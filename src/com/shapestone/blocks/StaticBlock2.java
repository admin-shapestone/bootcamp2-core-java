package com.shapestone.blocks;

public class StaticBlock2 {
	static int st = 9;

	StaticBlock2() {
		System.out.println("Inside the constructor of the class.");
	}

	public static void foo() {
		System.out.println("Inside the method foo.");
	}

	static {
		foo();
		System.out.println(st);
		System.out.println("Inside the static block. - 1");
	}

	public static void main(String[] args) {

		StaticBlock2 sbObj = new StaticBlock2();

	}
}
