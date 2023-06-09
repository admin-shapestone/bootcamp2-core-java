package com.shapestone.oops.polymorphism;

import java.util.Scanner;

public class MethodOverLoading1 {

	// method name should should be same type of arguments are different
	public int add(int i) {
		return i;
	}

	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + j;
	}

	public double add(int i, double j) {
		return i + j;
	}

	public float add(int i, float j) {
		return i + j;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = sc.nextInt();
		System.out.println("Enter second number");
		int second = sc.nextInt();
		System.out.println("Enter third number");
		int third = sc.nextInt();
		System.out.println("Enter fourth number");
		double fourth = sc.nextDouble();
		System.out.println("Enter fifth number");
		float fifth = sc.nextFloat();

		MethodOverLoading1 loading1 = new MethodOverLoading1();
		System.out.println(loading1.add(first));
		System.out.println(loading1.add(first, second));
		System.out.println(loading1.add(first, second, third));
		System.out.println(loading1.add(first, fourth));
		System.out.println(loading1.add(first, fifth));

	}

}
