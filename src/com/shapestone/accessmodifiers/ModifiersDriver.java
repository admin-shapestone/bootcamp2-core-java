package com.shapestone.accessmodifiers;

public class ModifiersDriver extends AbstractModifier {

	public static void main(String[] args) {
//		AbstractModifier abstractModifier = new AbstractModifier();
		ModifiersDriver driver = new ModifiersDriver();
		driver.display();
	}

	@Override
	public void display() {
		System.out.println("From driver class display method..");
		int i = 0;
		int j = 1;

	}

}
