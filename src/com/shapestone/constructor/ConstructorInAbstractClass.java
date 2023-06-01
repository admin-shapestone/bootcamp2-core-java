package com.shapestone.constructor;

abstract class ConstructorInAbstractClass {

	abstract void methodOne();

	ConstructorInAbstractClass(int i) { // a constructor can not be final,static,abstract.
		System.out.println("from parent class" + i);
	}
}

class Test extends ConstructorInAbstractClass {
	public void methodOne() {
		System.out.println("i am from method one");
	}

	Test(int i) {
		super(1000); // super key word must be first statement in constructor
		System.out.println("from parent base" + i);

	}

}
