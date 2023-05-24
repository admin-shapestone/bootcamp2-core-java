package com.shapestone.methodsandconstructors;

public class InstanceMethods {    
	public static void main(String [] args)  
	{   
		
	InstanceMethods obj = new InstanceMethods();   
	System.out.println("The sum is: "+obj.mul(12, 13)); 
	
	}  
	
	public int mul(int a, int b)  
	{  
    int s;
	s = a*b;    
	return s;  
	}  
	}  