package com.shapestone.task;

import java.util.Scanner;

public class Multliplication {

	public static void main(String[] args) {
		int mul = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(n + " x " + i + " = " + (n * i));

		}

	}
}
