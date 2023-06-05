package com.shapestone.oops;

public class MethodHindingB extends MethodHiding {

	static void Parent()
	{
		System.out.println(" i am from child class");
		

	}
    public static void main(String...args)
    {
    	MethodHindingB mh=new MethodHindingB();
    	mh.Parent();
    	MethodHiding m = new MethodHiding();
    	m.Parent();
    	MethodHiding c = new MethodHindingB();
    	c.Parent();
    }
	
}
