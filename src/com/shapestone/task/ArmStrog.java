package com.shapestone.task;

import java.util.Scanner;

public class ArmStrog {

	public static void main(String[] args) {
		int rev = 1, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int original = n;
		while (n != 0) {
			rev = n % 10;

			sum = sum + rev * rev * rev;
			n = n / 10;
		}
		if (sum == original) {
			System.out.println(" entered number is armstrng:" + sum);
		} else {
			System.out.println(" entered number is not armstong" + sum);
		}
	}

}
