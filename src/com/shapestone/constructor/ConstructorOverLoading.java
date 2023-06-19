package com.shapestone.constructor;

public class ConstructorOverLoading {
	int i;
	int j;
	int k;
	double l;

	ConstructorOverLoading(int a, int b) {
		i = a;
		j = b;
	}

	ConstructorOverLoading(int a, int b, int c) {
		i = a;
		j = b;
		k = c;
	}

	ConstructorOverLoading(int a, int b, int c, double d) {
		i = a;
		j = b;
		k = c;
		l = d;
	}

	void display() {
		System.out.println(i + " " + j + " " + k + " " + l);

	}

	public static void main(String[] args) {
		ConstructorOverLoading obj = new ConstructorOverLoading(786, 1947);
		ConstructorOverLoading obj1 = new ConstructorOverLoading(786, 1947, 2000);
		ConstructorOverLoading obj2 = new ConstructorOverLoading(786, 1947, 2000, 99.99d);
		obj.display();
		obj1.display();
		obj2.display();

	}
}
