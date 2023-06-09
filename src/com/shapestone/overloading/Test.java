package com.shapestone.overloading;

public class Test {
	
	public void m1(int i) {
		System.out.println("method calling is m1");
		
	}
	public void m1(String nagesh) {
		System.out.println("method calling nagesh");
		
		
		
	}
	public static void main(String [] args) {
		Test t = new Test();
		t.m1(50);
		
	}
	

}
