package com.shapestone.string;

public class StringBuffertoString {

	public static void main(String[] args) {
		
		StringBuffer str1=new StringBuffer("java class");
		String str2=str1.toString();
		System.out.println(str2);
		StringBuilder str3= new StringBuilder("for shapestone");
		String str4=str3.toString();  //to string method will convert object to string
		String str5=str4.concat("batch2"); //now it is the string so it cant be changed
		System.out.println(str4);

	}

}
