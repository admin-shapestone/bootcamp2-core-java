package com.shapestone.allwapperclasses;

public class BooleanWrapperExample {
	public static void main(String[] args) {
		Boolean isRaining = new Boolean(true);
		if (isRaining.booleanValue()) {
			System.out.println("Remember to take an umbrella!");
		} else {
			System.out.println("No need for an umbrella.");
		}

	}

}
