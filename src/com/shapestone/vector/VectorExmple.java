package com.shapestone.vector;

import java.util.Vector;

public class VectorExmple {

	public static void main(String[] args) {
		// Creating a new Vector
		Vector<String> vector = new Vector<>();

		// Adding elements to the vector
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Orange");

		// Accessing elements in the vector
		System.out.println("Element at index 0: " + vector.get(0));
		System.out.println("Element at index 1: " + vector.get(1));
		System.out.println("Element at index 2: " + vector.get(2));

		// Modifying an element
		vector.set(1, "Grapes");
		System.out.println("Updated element at index 1: " + vector.get(1));

		// Removing an element
		vector.remove(0);
		System.out.println("After removing element at index 0: " + vector);

		// Checking if the vector contains an element
		System.out.println("Does the vector contain 'Orange'? " + vector.contains("Orange"));

		// Checking the size of the vector
		System.out.println("Vector size: " + vector.size());
	}
}