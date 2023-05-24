package com.shapestone.constructor;

public class Zeroargumentconstructor {
	int i;
	
	private Zeroargumentconstructor() {
		i =5;
		System.out.println("Gopi");
	}
		public static void main(String[] args) {
			Zeroargumentconstructor obj = new Zeroargumentconstructor();
			System.out.println("value of i:" + obj.i);
		
	}

	

	}


