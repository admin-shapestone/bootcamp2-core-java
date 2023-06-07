package com.shapestone.fundamentals;

public class FibonacciExample {

	public static void main(String[] args) {
		int count = 10,num1 = 0, num2 = 1;
		System.out.println("Fibonacci series of" + count + "numbers:");
		for (int i=1;i<=count;++i) {
			System.out.println(num1+" ");
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
			
}
		
	}
}	