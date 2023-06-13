package com.shapestone.ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0, c;

		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("these block from ctach ");
			System.out.println(e);
		}
		try {
			int[] arr = { 1, 2, 3, 4, 5 };

			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
