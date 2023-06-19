package com.shapestone.assignment;

public class Perfect {

	public static void main(String[] args) {
		int sum=4,n=6;
		for(int d=1;d<n;d++) {
			if(n%d==0) {
				sum=sum+d;
				
			}
		}
	
if(sum==n) {
	System.out.println("It is a perfect Number:");
}else 
{
	System.out.println("It is a not a perfect Number:");

}
	}
}