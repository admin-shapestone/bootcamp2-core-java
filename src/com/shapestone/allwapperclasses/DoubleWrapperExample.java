package com.shapestone.allwapperclasses;

public class DoubleWrapperExample {

	public static void main(String[] args) {
		Double num1 = new Double(99.9);
		Double num2 = Double.valueOf("7.5");
		double product = num1.doubleValue() * num2.doubleValue();
		System.out.println("Product: " + product);

	}

}
