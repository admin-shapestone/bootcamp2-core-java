package com.shapestone.task;

public class PatternE {

public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		//space
		for(int j=5;j>i;j--) {
		System.out.print(" ");
		}
		//right side elements
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		//new line
		System.out.println("");
		}
		}
		}
