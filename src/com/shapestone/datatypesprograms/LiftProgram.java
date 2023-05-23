package com.shapestone.datatypesprograms;

import java.util.Scanner;

public class LiftProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
     if(n==1)
	System.out.println("its 1st floor"); 
   else if(n==2)
	System.out.println("its 2nd floor");
      else if (n==3)
	System.out.println("its 3rd floor");
  
      else if (n==4)
	System.out.println("its 4th floor");
    
      else if(n==5) 
	System.out.println("its 5th floor");
   
	}
}