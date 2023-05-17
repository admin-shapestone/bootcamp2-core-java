package com.shapestone.operators;

public class ArithamaticOperators {

	public static void main(String[] args) {
		int aValue = 'A';
		System.out.println(aValue);
		
		Thread r = new Thread( );
		System.out.println(r instanceof Thread); //true
		System.out.println(r instanceof Object); //true
		System.out.println(r instanceof Runnable); //true

		System.out.println("Possible value for explicit type cast is :: " + 1270%256);
		
		int i = 1270;
		byte b = 120;
		b = (byte) i;
		System.out.println(b);
		
		int a = 10;
		a =  - 20; // a = 10 - 20
		
		// Conditional operator
		
		// (codition (true)) ? firstblock : secondblock
		System.out.println(a);



	}

}
