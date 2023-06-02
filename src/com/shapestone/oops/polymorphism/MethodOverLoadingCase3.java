package com.shapestone.oops.polymorphism;

public class MethodOverLoadingCase3 {
	public void methodOne(Object o) {
		System.out.println("from object method");
	}

	public void methodOne(String s) {
		System.out.println("from string ");
	}

	public static void main(String[] args) {
		MethodOverLoadingCase3 overLoadingCase3 = new MethodOverLoadingCase3();
		overLoadingCase3.methodOne(new Object()); // from object
		overLoadingCase3.methodOne("abhi");// from string
		overLoadingCase3.methodOne(null);// from string because string is child class of object class.

		// Null is applicable for both object class and string. Hence object class is
		// the parent class of string. if parent class and child class are present it
		// always points to child only.
		// if child id not present it points to parent class.

	}

}
