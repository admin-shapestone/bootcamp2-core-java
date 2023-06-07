package com.shapestone.oops.polymorphism;

import java.util.Scanner;

public class MethodOverLoading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MethodOverLoading loading = new MethodOverLoading();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number...");
		int first = scanner.nextInt();
		
		System.out.println("Enter second number...");
		int second = scanner.nextInt();
		
		System.out.println("Enter third number...");
		int third = scanner.nextInt();
		
		System.out.println(loading.sum(first, second));

		System.out.println(loading.sum(first, second, third));

	}

	private int sum(int i, int j) throws Exception {
		System.out.println("I'm in sum() with two arguments..");
		return i + j;
	}

	public int sum(int i, int j, int k) {
		System.out.println("I'm in sum() with three arguments..");
		return i + j + k;
	}

}
