package com.shapestone.todaysassignment;

public class ArmStrong {

	public static void main(String[] args) {
		int no=153;
		int t1=no,sum=0,rem;
		while(no!=0) 
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem*rem*rem;
			
      }
      if (sum==t1)
      {
    	  System.out.println( sum + "the number is armstrong");
      }
      else
      {
    	  System.out.println( sum + "the number is not a armstrong");
      }
	}
	

}
