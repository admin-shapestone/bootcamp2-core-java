package com.shapestone.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		System.out.println("Element at index 0: " + linkedList.get(0));
		System.out.println("Element at index 1: " + linkedList.get(1));
		System.out.println("Element at index 2: " + linkedList.get(2));

		// Modifying an element
		linkedList.set(1, "Grapes");
		System.out.println("Updated element at index 1: " + linkedList.get(1));

		// Removing an element
		linkedList.remove(0);
		System.out.println("After removing element at index 0: " + linkedList);

		// Checking if the linked list contains an element
		System.out.println("Does the linked list contain 'Orange'? " + linkedList.contains("Orange"));

		// Checking the size of the linked list
		System.out.println("Linked list size: " + linkedList.size());
	}
}