package com.shapestone.staticandinstancesflow;

public class StaticFlow {

	static int i = 10;
	static {
     print();
		System.out.println(i);
		System.out.println(" static first method");
	}

	static void print() {
		System.out.println(" static secound method");
		System.out.println(j);
	}

	public static void main(String[] args) {
		printout();
		System.out.println("this is main method");
	}

	static void printout() {
		print();
		System.out.println(j);
		System.out.println(" static block 2");
	}
      
		static int j=20;
}
