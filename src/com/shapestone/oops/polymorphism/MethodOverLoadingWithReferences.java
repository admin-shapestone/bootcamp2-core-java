package com.shapestone.oops.polymorphism;

public class MethodOverLoadingWithReferences {

	public void methodOne(String s) {
		System.out.println("from string ");
	}

	public void methodOne(StringBuffer a) {
		System.out.println("from stringbuffer");
	}

	public static void main(String[] args) {

		MethodOverLoadingWithReferences overLoadingWithReferences = new MethodOverLoadingWithReferences();

		overLoadingWithReferences.methodOne("abhi");// from string
		overLoadingWithReferences.methodOne(new StringBuffer("abhi"));// from stringbuffer.
		// overLoadingWithReferences.methodOne(null); null is applicable for both the
		// methods it creates ambiguous thats why we will get c.t.e and there is no
		// relation between string and stringbuffer.

	}

}
