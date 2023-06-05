package com.shapestone.oops.polymorphism;

public class TestMethodOverriding {

	public static void main(String[] args) {
		C c = new C();
		
		System.out.println(c.m1());
		
		
		Child d = new Child();
		d.methodOne(10);
		
		Three t = new Three();
		t.modifer();
		
	}

	

}
