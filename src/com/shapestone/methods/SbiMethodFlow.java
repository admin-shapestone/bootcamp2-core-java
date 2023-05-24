package com.shapestone.methods;

public class SbiMethodFlow{
	
	void m1() {
		m2();
		System.out.println("Go to Counter 4");
	}
	 void m2() {
		m3();
		System.out.println("Go to Counter 3");
	}
	 void m3() {
		m4();
		System.out.println("Go to Counter 2");
	}
     void m4() {
    	System.out.println("Go to Counter 1");
    }
    private static void m5() {
    	System.out.println("please come tomorrow");
    }
	public static void main(String[] args) {
		SbiMethodFlow obj = new SbiMethodFlow();
		obj.m1();
		m5();
	}
}
