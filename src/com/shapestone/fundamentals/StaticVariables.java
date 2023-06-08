package com.shapestone.fundamentals;

public class StaticVariables {
	static int a = 786;
	static int b = 108;
	static int c = 999;

	public static void main(String[] args) {
		System.out.println(a);// 1-way(directly possible)
		System.out.println(StaticVariables.b);// 2-way(By using class name)
		StaticVariables obj = new StaticVariables();
		obj.m1();
	}

	void m1() {
		System.out.println(StaticVariables.c);// 3-way(By using reference variable)
	}
}