package com.shapestone.exception_handling;

/*creating a Exception object explictly and handover to JVM manually by using throw keyword*/

public class ThrowCase1 {

	public static void main(String[] args) {
		throw new ArithmeticException("not / by zero");

	}

}
