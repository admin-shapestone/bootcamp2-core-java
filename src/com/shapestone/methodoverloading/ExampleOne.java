package com.shapestone.methodoverloading;

public class ExampleOne 
{
	 void m1(int i) {
		System.out.println("int-argument="+i );
	}

	 void m1(int i, int j)
	 {
		System.out.println("int"+i+",int argument method="+j);
	}

	void m1 (char ch) 
	{
		System.out.println("char-argument method="+ch);
	}

	public static void main(String[] args)
	{
		ExampleOne ex = new ExampleOne();
		ex.m1(10);
		ex.m1(10, 20);
		ex.m1('R');

	}

}
//above three methods are overloaded methods