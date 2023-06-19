package com.shapestone.allwapperclasses;

public class IntegerWrapperExample {

	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = Integer.valueOf("20");
		int sum = num1.intValue() + num2.intValue();
		System.out.println("Sum: " + sum);

	}

}
