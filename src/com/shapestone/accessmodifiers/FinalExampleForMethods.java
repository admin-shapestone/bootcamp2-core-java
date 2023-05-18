package com.shapestone.accessmodifiers;

public class FinalExampleForMethods {

	public static void main(String[] args) {
		final int num = 100;
		num = 7;//
		Method2 m = new Method2();
		m.m1();
	}

}

class Method1 {
	final void m1() // if we apply final modifier to a method.then the method is know as final
					// method
	{
		System.out.println("this is from method1");
	}
}

class Method2 extends Method1 {
	void m1() // we will get compile time error beacuse m1 method is final so we can't
				// override that method
	{
		System.out.println("this is from method 2");
	}

}