package com.shapestone.oops;

public class MethodOverlodingDataTypes{
	
		
		  public static void main(String...args) {
			  MethodOverlodingDataTypes sc=new MethodOverlodingDataTypes();
			 sc.m1(10);
		    
		  }
		   static void m1(float x)
		   {
		      System.out.println("float number");
		   }
		   static void m1(int x)
		   {
		       System.out.println("int number");
		   } 
		    static void m1(double  x)
		    {
		        System.out.println("double number");
		    }
		  

	}
