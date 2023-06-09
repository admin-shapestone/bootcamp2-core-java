package com.shapestone.oops;

public abstract class AbstractionWithAbstractClass {

	abstract double deposite();

	abstract double withDraw();

	abstract double getAvaiableBalance();

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.deposite());

		System.out.println(t.withDraw());
		System.out.println(t.getAvaiableBalance());
	}

}

class Test extends AbstractionWithAbstractClass {

	double deposite() {
		return 10000;
	}

	double withDraw() {

		return 500;
	}

	double getAvaiableBalance() {

		return deposite() - withDraw();
	}
}
