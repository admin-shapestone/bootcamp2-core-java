package com.shapestone.methodsandconstructors;

public class Methods {
    int number;
    public void A1() {
    	A2();
    	System.out.println("printA1");
    }
	public static  void A2() {
		A3();
		System.out.println("printA2");
	}
	public static void A3() {
		System.out.println("printA3");
	}
	
	public static void A4() {
		System.out.println("printA4");
	}
	

	public static void main(String[] args) {
	Methods m1=new Methods();
	m1.A1();   
	A4();
	}

}   // output  
   //printA3
   //printA2
   //printA1
   //printA4
