package com.shapestone.variablesandtypes;

public class Functions {
	private String firstName;
	private String lastName;

	public Functions(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void printFullName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
}