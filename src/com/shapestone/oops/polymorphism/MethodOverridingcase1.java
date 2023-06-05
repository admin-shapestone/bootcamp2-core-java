package com.shapestone.oops.polymorphism;

class MethodOverridingcase1 {

	public Object m1() { // child method return type should be same as parent method type.
		return null; // or parent to the child method.
	}

}

class C extends MethodOverridingcase1 {
	public StringBuffer m1() {
		return null;
	}
}

/*
 * class MethodOverridingcase1 {
 * 
 * public StringBuffer m1() { // parent method should be must be equal to child
 * method return type or parent // to child // return type. return null; }
 * 
 * }
 * 
 * class C extends MethodOverridingcase1 { public StringBuffer m1() { return
 * null; } }
 */

/*
 * class MethodOverridingcase1 {
 * 
 * public String m1() { // child method return type must be equal to parent
 * method return type or parent // to child // return type. return null; }
 * 
 * }
 * 
 * class C extends MethodOverridingcase1 { public String m1() { return null; } }
 */