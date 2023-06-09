package com.shapestone.blocks;

public class StaticBlock {

	static int j = 100;

	StaticBlock() {
		System.out.println(i);
	}

	int i = 20;
	static

	{

		System.out.println(j);
		System.out.println("from static block");
	}

	static void method1() {
		System.out.println("from m1");
	}

	public static void main(String[] args) {
		System.out.println("from main");
		method1();

		new StaticBlock();
	}

}
