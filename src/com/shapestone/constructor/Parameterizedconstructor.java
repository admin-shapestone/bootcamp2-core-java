package com.shapestone.constructor;

public class Parameterizedconstructor {
	int i;
	int j;
	int k;

	Parameterizedconstructor(int i, int j) {
		this.i = i;
		this.j = j;

		System.out.println(i + " " + j);
	}

	Parameterizedconstructor(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
		System.out.println(i + " " + j + " " + k);

	}

	public static void main(String args[]) {
		Parameterizedconstructor obj = new Parameterizedconstructor(10, 200);
		Parameterizedconstructor obj1 = new Parameterizedconstructor(10, 200, 300);

	}

}
