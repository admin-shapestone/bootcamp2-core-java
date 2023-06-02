package com.shapestone.task;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) { 
		boolean flag=true;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
		System.out.println("it is a prime number");
	}
		else {
			System.out.println("it is not a prime number");
	}
}}
