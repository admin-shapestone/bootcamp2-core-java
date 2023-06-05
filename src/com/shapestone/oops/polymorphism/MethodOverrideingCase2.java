package com.shapestone.oops.polymorphism;

public class MethodOverrideingCase2 {

	public void methodOne(int i) {
		System.out.println("from parent class  " + i);
	}

}

class Child extends MethodOverrideingCase2 {

	public void methodOne(int i) {
		System.out.println("from child class  " + i);

	}
}

/*
 * class A { public int m1() { return 10; } }
 * 
 * class B extends A { public double m1() { // Co-varient is not applicable for
 * primitives only for referance types return 10; }
 * 
 * 
 * }
 */
