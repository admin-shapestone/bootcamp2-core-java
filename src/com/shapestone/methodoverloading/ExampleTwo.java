package com.shapestone.methodoverloading;

public class ExampleTwo {

	double m1(int a) {
		System.out.println("int,int arguments method");
		return a;
	}

	int m1(float f) {
		System.out.println("float argument method");
		return 100;
	}

	public static void main(String[] args) {
		ExampleTwo ex = new ExampleTwo();
		 System.out.println(ex.m1(10));
		 
		int x = ex.m1(10.5f);
		System.out.println("return type=" + x);
	}


}


