package com.shapestone.assignment;

public class Arm {

	public static void main(String[] args) {
		
		int n=370,temp,Armstrong=0;
		int orginal=n;
		while (n>0) {
			temp=n%10;
			temp=(int) Math.pow(temp, 3) ;
			Armstrong=Armstrong+temp;
			n=n/10;
		}
		if(Armstrong==orginal) 
		System.out.println("Armstrong...");
		
		else System.out.println("Not Armstrong...");
		}

	}


//sum of the cubes of the digits of any number is equal to the number it self is called Armstrong...

