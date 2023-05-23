package com.shapestone.wrapperclass;

public class XxxValueMethod {
	// xxxvaluue method is to find primitive data types for a given wrapper class objects

	public static void main(String[] args) {
		Integer b=new Integer("127");
		System.out.println(b.byteValue());
		System.out.println(b.shortValue());
		System.out.println(b.longValue());
		System.out.println(b.intValue());
		System.out.println(b.floatValue());
		System.out.println(b.doubleValue());
	//	System.out.println(b.BooleanValue()); these primitives wont get the Integer object values 
	//	System.out.println(b.CharacterValue());
		
		

		
		// we need to create an object for the Character and Boolean
		Character ch= new Character('a');
		char c=ch.charValue();
	    System.out.println(c);
		
	}  
	

}
