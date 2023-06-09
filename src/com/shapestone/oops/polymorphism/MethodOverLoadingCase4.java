package com.shapestone.oops.polymorphism;

public class MethodOverLoadingCase4 {

	public void methodOne(int i) {
		System.out.println("from general method");
	}

//	public  int methodOne(int j) 
//	{
//		//System.out.println("from args-method");
//		return 0;
//	}

	public static void main(String[] args) {

		MethodOverLoadingCase4 overLoadingCase4 = new MethodOverLoadingCase4();
		overLoadingCase4.methodOne(10);

		// it doesn't matter about return type.Wheather the arguments are same we will
		// get c.t.e.
	}

}
