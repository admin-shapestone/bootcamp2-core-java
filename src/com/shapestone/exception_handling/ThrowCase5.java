package com.shapestone.exception_handling;

public class ThrowCase5 extends RuntimeException {

	public static void main(String[] args) {

		throw new ThrowCase5();// Customized Exception
	}

}

/*
 * public class ThrowCase5 {
 * 
 * public static void main(String[] args) {
 * 
 * throw new ThrowCase5(); // Test is not throeable type that why we will get
 * compile time error }
 * 
 * }
 */