package com.shapestone.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}

/**
bike is created
running safely..
gear changed
*/