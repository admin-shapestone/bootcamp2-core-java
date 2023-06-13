package com.shapestone.string;

public class Equals {

	public static void main(String[] args) {
     String s="akshay";
     String[] a= {"r","akshay","kumar"};
     String a1="akshay";
     System.out.println(a1.equals(a[2]));
     
     String s1=new String("akshay");
     String s2=new String("akshay");
     String s3="akshay";
      System.out.println(s1==s2); 
      System.out.println(s1.equals(s3)); 
     
     
	}
 
}
