package com.shapestone.strings;

public class StringFormatExp {
	public static void main(String[] args) {

		String name = "Nitish";// String value
		int age = 23;// String value

		String formattedString = String.format("Hello, my name is %s and I'm %d years old.", name, age);
		System.out.println(formattedString);

	}

}
//In this example, we have a name variable with the value "Nitish" and an age variable with the value 23.
//The String.format() method is used to create a formatted string. 
//The format string is "Hello, my name is %s and I'm %d years old.", where %s is a placeholder for a string value (name), 
//and %d is a placeholder for an integer value (age).