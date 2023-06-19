package com.shapestone.overloadingexampletwo;

public class OverloadingTwo {
	public static void main(String[] args) {
		Overloading N = new Overloading();
		System.out.println(N.add(10, 20));
		System.out.println(N.add(10, 20, 30));
	}
}

/**
30
60
*/