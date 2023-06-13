package com.shapestone.string;

public class Concat {

	public static void main(String[] args) {
     String s1="welcome";
     System.out.println(s1);
     s1.concat("to hyderabad");//strings are immutable
     System.out.println(s1);
     s1=s1.concat("to mumbai");
     System.out.println(s1);
	}

}
