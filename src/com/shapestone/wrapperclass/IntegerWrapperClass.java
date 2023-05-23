package com.shapestone.wrapperclass;

public class IntegerWrapperClass {

	public static void main(String[] args) {
	/*	int i=10;
		Integer a= Integer.valueOf(i);//converting int to integer
		Integer j=a; //  autoboxing converting primitive data type to wrapper object

		System.out.println(a+" "+j+" ");  */

// unboxing converting wrapper class object to primitive data types
   Integer a= new Integer(10);
   int n=a.valueOf(a);
   int j=n;
   System.out.println(n+" "+j+" ");

	} 
	}



