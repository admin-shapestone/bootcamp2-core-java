package com.shapestone.oops.polymorphism;

/*
 * we can't override static methods.if we perform method overriding concept on
 * static methods we will get C.T.E.
 * 
 * We can't override private methods also.
 * 
 * if both the methods are static.such type of concept is knows as method
 * hideing. In method hideing method resulation always takes referance types.
 */

public class MethodOverridingCase4 {

	public static void main(String[] args) {
		case4 c = new case4();
		c.methodCase4();// from child 
		MethodOverridingCase4 m = new MethodOverridingCase4();
		m.methodCase4();// from parent
		MethodOverridingCase4 mm = new case4();
		mm.methodCase4();// parent

	}

	public static void methodCase4() {
		System.out.println("from parent");
	}

}

class case4 extends MethodOverridingCase4 {
	public static void methodCase4() {
		System.out.println("from child");
	}
}

/*
 * public class MethodOverridingCase4 {
 * 
 * // we will get C.TE public void methodCase4() {
 * System.out.println("from parent"); }
 * 
 * }
 * 
 * class case4 extends MethodOverridingCase4 { public static void methodCase4()
 * { System.out.println("from child"); } }
 */

/*
 * public class MethodOverridingCase4 {
 * 
 * 
 * 
 * 
 * public static void methodCase4() { System.out.println("from parent"); }
 * 
 * }
 * 
 * class case4 extends MethodOverridingCase4 { public void methodCase4() {
 * System.out.println("from child"); } }
 */
