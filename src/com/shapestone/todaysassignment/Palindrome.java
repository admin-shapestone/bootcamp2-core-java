package com.shapestone.todaysassignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	    int temp,rev,sum=0,rem;
		temp=n;
        while (n>0) {
        	
        	rem=n%10;
        	sum=(sum*10)+rem;
        	n=n/10;	
        }
        	if(temp==sum)
        	{
        System.out.println("it is a palindrome");
        }
        else
        {
        	System.out.println("it is not a palindrome");
        }
        
	}}

