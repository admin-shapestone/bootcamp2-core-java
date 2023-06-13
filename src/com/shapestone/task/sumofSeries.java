package com.shapestone.task;

import java.util.Scanner;

public class sumofSeries {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the series number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum= 1.0/i;
		  
		}
        System.out.println("Sum:"+ sum);
	}

}
