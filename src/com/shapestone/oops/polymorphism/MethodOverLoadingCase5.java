package com.shapestone.oops.polymorphism;

public class MethodOverLoadingCase5 {
	
	
	public void methodOne(int i) 
	{
		System.out.println("from int type");
	}
	
	public void methodOne(long l) 
	{
		System.out.println("from long type");
	}
   public void methodOne(float f) 
   {
	   System.out.println("from float type");
   }
   public void methodOne(double d) 
   {
	   System.out.println("from double type");
   }
	public static void main(String[] args) {
		MethodOverLoadingCase5 loadingCase5 = new MethodOverLoadingCase5();
		loadingCase5.methodOne(14);
		loadingCase5.methodOne(14l);
		loadingCase5.methodOne(14.6f);
		loadingCase5.methodOne(15.6d);
	}

}
