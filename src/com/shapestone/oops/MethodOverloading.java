package com.shapestone.oops;

import java.util.Scanner;

public class MethodOverloading {

	/*public void m1(int i) {
		System.out.println(i);
	}

	public void m1(int i, int j) {
		System.out.println(i + j);

	}

	public void m1(int i, int j, int k) {
		System.out.println(i + j + k);

	}

	public static void main(String... args) {
		MethodOverloading m = new MethodOverloading();
		m.m1(1);
		m.m1(1, 2);
		m.m1(2, 3, 4);
	}*/
	public int m1(int i)
	{
		return i;
	}
	public int m1(int i,int k)
	{
		return i+k;
	}
	public int m1(int i,int k,int j) 
	{
		return i+j+k;
	}
	
   public static void main(String...args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println(" enter the firt number");
	   int number1=sc.nextInt();
	   System.out.println(" enter the second number");
	   int number2=sc.nextInt();
	   System.out.println(" enter the third number");
	   int number3=sc.nextInt();
	   MethodOverloading mo=new MethodOverloading();
	 System.out.println( mo.m1(number1));
	 System.out.println (mo.m1(number1,number2));
	 System.out.println(mo.m1(number1,number2,number3));
   }  
}
	
	

