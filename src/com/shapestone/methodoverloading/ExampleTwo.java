package com.shapestone.methodoverloading;

public class ExampleTwo {

	double m1(int a, int b) {
		System.out.println("int,int arguments method");
		return 20.5;
	}

	int m1(float f) {
		System.out.println("float argument method");
		return 100;
	}

	public static void main(String[] args) {
		ExampleTwo ex = new ExampleTwo();
		double d = ex.m1(10, 20);
		System.out.println("return type=" + d);
		int x = ex.m1(10.5f);
		System.out.println("return type=" + x);
	}


}


