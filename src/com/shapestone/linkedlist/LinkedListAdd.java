package com.shapestone.linkedlist;

import java.util.LinkedList;

public class LinkedListAdd {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Orange");
		linkedList.add(1, "Banana");
		System.out.println(linkedList);
	}
}