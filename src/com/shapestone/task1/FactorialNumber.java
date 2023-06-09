package com.shapestone.task1;

public class FactorialNumber {

	public static void main(String[] args) {

		int fact = 1;
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;// 1 *2 *3*4*5
		}
		System.out.println(fact);
	}

}
