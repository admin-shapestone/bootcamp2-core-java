package com.shapestone.oops.polymorphism;

/*In overrideing we have increase or equal  the access level of overriding method but on decrease .
 private<default<protected<public
 We can't override private methods
 
 
*/
/*public class MethodOverridingCase3 {

	void modifer() {
		System.out.println("from parent metho");
	}
}

class Three extends MethodOverridingCase3 {
	protected  void modifer() {
		System.out.println("from child method");
	}
}*/
//
/*
 * public class MethodOverridingCase3 {
 * 
 * protected void modifer() { System.out.println("from parent metho"); } }
 * 
 * class Three extends MethodOverridingCase3 { protected void modifer() {
 * System.out.println("from child method"); } }
 */
public class MethodOverridingCase3 {

	protected void modifer() {
		System.out.println("from parent metho");
	}
}

class Three extends MethodOverridingCase3 {
	public void modifer() {
		System.out.println("from child method");
	}
}