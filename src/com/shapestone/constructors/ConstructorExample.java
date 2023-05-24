package com.shapestone.constructors;

public class ConstructorExample {
	int x;

	public ConstructorExample(int y) {
		x = y;
	}

	public static void main(String[] args) {
		ConstructorExample myZ = new ConstructorExample(5);
		System.out.println(myZ.x);
	}

}
