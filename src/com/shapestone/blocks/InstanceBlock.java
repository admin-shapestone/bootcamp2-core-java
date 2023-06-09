package com.shapestone.blocks;

public class InstanceBlock {

	InstanceBlock() {
		System.out.println("No argument constructor");
	}

	static void method1() {
		System.out.println("from methd1");
	}

	InstanceBlock(String a) {

		System.out.println("String argument constructor");
	}

	{
		System.out.println("instance block 1");
	}

	InstanceBlock(int a, int b) {

		System.out.println("Int arguments constructor");
	}

	int j = 100;
	{
		System.out.println(j);
		System.out.println("Instance block 2");
	}

	public static void main(String[] args) {

		new InstanceBlock();
		method1();

		new InstanceBlock("I like Java");

		new InstanceBlock(10, 20);

	}
}
