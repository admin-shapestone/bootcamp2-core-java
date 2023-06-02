package com.shapestone.task;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		int base,power,result=1;
		Scanner sc=new Scanner(System.in);
          System.out.println("enter base number");
          System.out.println("enter power number");
           base=sc.nextInt();
           power=sc.nextInt();
          for(int i=1;i<=power;i++) 
          {
        	  result *=base;
          }
          System.out.println(result);
          
          
	}

}
