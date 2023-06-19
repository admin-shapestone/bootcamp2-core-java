package com.shapestone.overloadingexampleone;

public class MethodOverloading {
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		double result;
		obj.demo(10);
		obj.demo(10, 20);
		result = obj.demo(5.5);
		System.out.println("output : " + result);
	}
}

/**
a: 10
a and b: 10,20
double a: 5.5
output : 30.25
*/