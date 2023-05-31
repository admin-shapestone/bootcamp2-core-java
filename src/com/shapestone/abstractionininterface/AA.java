package com.shapestone.abstractionininterface;

interface AA {

	void m1();

}

interface BB {
	void m2();
}

interface C extends AA, BB {
	void m3();
}

class D implements C {
	public void m1() {
		System.out.println("from method1");
	}

	public void m2() {
		System.out.println("from method2");
	}

	public void m3() {
		System.out.println("from method3");
	}
}
