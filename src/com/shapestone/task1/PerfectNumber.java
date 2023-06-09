package com.shapestone.task1;

public class PerfectNumber {

//	static boolean isPerfect(int num) {
//
//		int sum = 0;
//		for (int i = 1; i < num; i++) {
//			if (num % i == 0) {
//				sum = sum + i;
//			}
//		}
//		if (sum == num)
//			return true;
//		return false;
//	}
//
//	public static void main(String[] args) {
//		int num = 21;
//		boolean b = isPerfect(num);
//
//		if (b) {
//			System.out.println("its a perfect number");
//		} else {
//			System.out.println("not a perfect number");
//		}

//	Approch 2

	public static void main(String[] args) {
		int sum = 0;
		int num = 218;
		for (int i = 1; i < 28; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("its a perfect number");
		} else
			System.out.println("not a perfect number");
	}

}
