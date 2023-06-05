package com.shapestone.oops;

public class MethodOverridingB extends MethodOverridingA {
	public void Education() {
		System.out.println("hotel management");
	}

	void college() {
		System.out.println(" bbm");
	}

	public void Marry() {
		System.out.println(" prira");
	}

	public static void main(String... args) {
		MethodOverridingB m = new MethodOverridingB();
		m.college();
		m.Marry();
		m.Educaion();
		MethodOverridingA m1 = new MethodOverridingA();
		m.Educaion();
		MethodOverridingA m2 = new MethodOverridingB();
		m.Educaion();
		m.college();
	}

}
