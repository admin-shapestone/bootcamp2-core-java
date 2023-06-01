package com.shapestone.oops.inheritance;

public class Child extends Parent {
	
	public void methodA() {
		System.out.println("Child :: methodA() ...");
	}

	public void methodB() {
		System.out.println("Child :: methodB()...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.methodA();
//		parent.metho
//		child.methodB();
	}

}
