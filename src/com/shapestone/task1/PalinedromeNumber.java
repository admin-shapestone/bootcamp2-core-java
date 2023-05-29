package com.shapestone.task1;

import java.util.Scanner;

public class PalinedromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		int revNum = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (revNum == rev) {
			System.out.println("its a palinedroem");
		} else {
			System.out.println("not a palinedrome number");
		}
	}
}