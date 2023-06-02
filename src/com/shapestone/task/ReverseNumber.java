package com.shapestone.task;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
        int n=sc.nextInt();
        while(n>0)
        {
        rev=rev*10+n%10;
        n=n/10;
	}
    System.out.println("reverse number is"  +  rev);
}
}
