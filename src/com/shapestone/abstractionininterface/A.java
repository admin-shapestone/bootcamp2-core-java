package com.shapestone.abstractionininterface;

public interface A {

	public abstract void m1();

	abstract void m2();

//	public void m5
//	{
//		System.out.println("from m5"); interface can consist only anstract methods
//	}

	public void m3();

	void m4();

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}

class B implements A {
	public void m1() {
		System.out.println("from m1");
	}

	public void m2() {
		System.out.println("from m2");
	}

	public void m3() {
		System.out.println("from m3");
	}

	public void m4() {
		System.out.println("from m4");
	}
}
