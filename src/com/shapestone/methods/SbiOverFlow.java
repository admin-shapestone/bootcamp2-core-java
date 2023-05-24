package com.shapestone.methods;

public class SbiOverFlow {

	void m1() {
		m2();
		System.out.println("Go to Counter 4");
	}
	 void m2() {
		m3();
		System.out.println("Go to Counter 3");
	}
	 void m3() {
		m1();
		System.out.println("Go to Counter 2");
	}
	 static  void m4() {
    	 m5();
    	System.out.println("Go to Counter 1");
    }
	 static void  m5() {
    	m4();
    	System.out.println("please come tomorrow");
    }
	public static void main(String[] args) {
		SbiMethodFlow obj = new SbiMethodFlow();+
		obj.m1();
		m5();
	}

	}
