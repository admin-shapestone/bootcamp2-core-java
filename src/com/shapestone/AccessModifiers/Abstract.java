package com.shapestone.AccessModifiers;

public class Abstract extends AbstractExample {
	public static void main(String[] args) {
		Abstract demo = new Abstract();
		demo.order();
         demo.bill();
	}

	@Override
	public void order() {
		System.out.println("get 2 biryanis ");

	}

	@Override
	public void bill() {
	System.out.println("your bill is 500");
		
	}
	
	

}
