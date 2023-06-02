package com.shapestone.methodoverloading;

public class ExampleThree {

	void sum(int a, int b) {
		System.out.println("int arguments method");
		System.out.println(a + b);
	}

	void sum(long a, long b) {
		System.out.println("long arguments method");
		System.out.println(a + b);
	}

	void sum(int a, long b) {
		System.out.println("int,long arguments method");
		System.out.println(a + b);
	}

	void sum(long a, int b) {
		System.out.println("long,int arguments method");
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		ExampleThree ex = new ExampleThree();
		ex.sum(1, 2);
		ex.sum(10L, 20L);
		ex.sum(100, 200L);
		ex.sum(1000L, 2000);
	}

}
