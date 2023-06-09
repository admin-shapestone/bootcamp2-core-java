package com.shapestone.constructor;

public class ConstructorOverLoading {
	int a;
	int b;
	int c;
	double d;
	String name;
	float f;

	ConstructorOverLoading(int a, int b) {
		this.a = a;
		this.b = b;

		System.out.println(a + " " + b);
	}

	ConstructorOverLoading(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + " " + b + " " + c);
	}

	ConstructorOverLoading(int a, int b, int c, double d) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		System.out.println(a + " " + b + " " + c + " " + d);
	}

	ConstructorOverLoading(String name, float f, double d) {
		this.name = name;
		this.f = f;
		this.d = d;
		System.out.println(name + " " + f + " " + d + " ");
	}
	ConstructorOverLoading(double d,float f,String name) {
		this.d = d;
	    this.f = f;
		this.name = name;
		System.out.println(d + " " + f + " " + name + " ");
	}


	public static void main(String[] args) {

		ConstructorOverLoading c1 = new ConstructorOverLoading(1, 2);
		ConstructorOverLoading c2 = new ConstructorOverLoading(1, 2, 3);
		ConstructorOverLoading c3 = new ConstructorOverLoading(1, 2, 3, 4.0);
		ConstructorOverLoading c4 = new ConstructorOverLoading("abhi", 10.0f, 100.6d);
		ConstructorOverLoading c5 = new ConstructorOverLoading(100.6d, 10.0f,"abhi");
	}

}
