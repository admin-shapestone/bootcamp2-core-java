package com.shapestone.wrapperclass;

public class ValueOf {

	public static void main(String[] args) {
		Integer I=Integer.valueOf("10");
		Short S=Short.valueOf("10");
		Long L=Long.valueOf("10");
		Float f=Float.valueOf("10.0f");
		Double b=Double.valueOf("10.0");
		Boolean B=Boolean.valueOf("true");
		Character c=Character.valueOf('a');//only contains char arguments not allows strings 
		System.out.println(I);
		System.out.println(S);
		System.out.println(L);
		System.out.println(f);
		System.out.println(b);
		System.out.println(B);
		System.out.println(c);
	}
}
// valueof()method used to create wrapper class object for primitive data types and strings
// except character all wrapper classes contain valueof() method