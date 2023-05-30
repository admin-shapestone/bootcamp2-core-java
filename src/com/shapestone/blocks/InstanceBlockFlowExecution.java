package com.shapestone.blocks;

public class InstanceBlockFlowExecution {

	{
		int i = 10;
		System.out.println(i);
		System.out.println("from instance block 1");
	}

	static void m1() {
		System.out.println("from m1");
		m2();

	}

	{
		int j = 29;
		System.out.println(j);
		m3();
	}
	{
		System.out.println("from  instance block 2");
	}

	static void m3() {
		System.out.println("from m3");
	}

	static void m2() {
		System.out.println("from m2");

	}

	public static void main(String[] args) {
		System.out.println("from main");
		InstanceBlockFlowExecution ib = new InstanceBlockFlowExecution();
		ib.m1();

	}

}
//from main
//from instance block
//from m1
//from m2