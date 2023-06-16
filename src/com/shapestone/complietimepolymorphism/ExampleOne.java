package com.shapestone.complietimepolymorphism;

public class ExampleOne {

	public void m1(String A) {
		System.out.println("string version");
	}

	public void m1(StringBuffer sb) {
		System.out.println("String buffer version");
		}

	public void m1(Object o) {
		System.out.println("these is object version");
       }

	public static void main(String[] args) {
		ExampleOne e = new ExampleOne();
		e.m1("rrr");
	   e.m1(new StringBuffer("y"));
		e.m1(new Object ());
		//e.m1(null);
         
	}

}
