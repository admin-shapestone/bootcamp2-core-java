package com.shapestone.wrapperclass;

public class ToStringMethod {  //to find String for the given primitive value and wrapper objects

	public static void main(String[] args) {
		String s1=Integer.toString(10);
		String s2=Character.toString('a');
		String s3=Boolean.toString(true);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		 Integer I=new Integer(109);
		 String s=I.toString();
		 System.out.println(s);
	}

}