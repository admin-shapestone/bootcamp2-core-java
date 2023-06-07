package com.shapestone.oops.polymorphism;

public class OverLoadingWithReferenceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingWithReferenceTypes referenceTypes = new OverLoadingWithReferenceTypes();
		referenceTypes.m1(new StringBuffer());
	}

	void m1(String s) {
		System.out.println("String method");
	}
	
	
	
	void m1(StringBuffer sb) {
		System.out.println("StringBuffer method");
	}

}
