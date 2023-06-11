package com.shapestone.overloading;

public class Calculations {
	
	public void add1(int a,int b) {
		System.out.println("calling method is add1");
		
	}
	
	public void add1(int a, int b, int c) {
		System.out.println("calling method is add2");
		
	}
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.add1(5,10);
		c.add1(10, 20, 30);
		
	
	}

}
