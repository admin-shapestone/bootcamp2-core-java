package com.shapestone.methos;

public class FibonnaciSeries {

	int Fnum = 0;
	int Snum = 1;

	public static void fib(int Fnum, int Snum) {

		for (int i = 0; i < 10; i++) {

			int sum = Fnum + Snum;

			System.out.print(" " + sum);

			Fnum = Snum;
			Snum = sum;
		}

	}

	public static void main(String[] args) {

		int Fnum = 0;
		int Snum = 1;
		System.out.print(Fnum + " " + Snum);
		fib(Fnum, Snum);

	}

}
