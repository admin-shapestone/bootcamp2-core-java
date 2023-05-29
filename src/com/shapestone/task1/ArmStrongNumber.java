package com.shapestone.task1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem, sum = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem * rem * rem;
		}
		if (sum == temp)
			System.out.println("its  a armstrong number");

		else
			System.out.println("not a arm strong number");
	}

}
