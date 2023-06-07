
package com.shapestone.oops.polymorphism;


public class MethodOverrideBase {

	public void m1(Object str) throws ArithmeticException {
		System.out.println("I'm from base reference of String method...");
	}
	public int m2(char c) {
		System.out.println("I'm from base privitive of char method ...");
		return  'N';
	}
}
