package com.shapestone.task;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;

		int fn = 0, sn = 1, tn;

		System.out.print("Enter number of terms of series : ");
		number = sc.nextInt();

		System.out.print(fn + " " + sn + " ");

		for (int i = 3; i <= number; i++) {
			tn = fn + sn;
			System.out.print(tn + " ");
			fn = sn;
			sn = tn;
		}
	}

}
//INPUT: 8
//OUTPUT: 0 1 1 2 3 5 8 13