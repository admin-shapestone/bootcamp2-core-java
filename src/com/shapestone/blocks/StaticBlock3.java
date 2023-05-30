package com.shapestone.blocks;

public class StaticBlock3 {

	static int i = 10;
	static {
		method1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		method1();
		System.out.println("from main");
	}

	public static void method1() {
		System.out.println(j);
	}

	static {
		System.out.println("second static block");
	}
	static int j = 20;
}

//0
//first sttic block
//second static block
//20
//from main