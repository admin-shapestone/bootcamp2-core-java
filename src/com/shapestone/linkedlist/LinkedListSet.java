package com.shapestone.linkedlist;

import java.util.LinkedList;

public class LinkedListSet {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		linkedList.set(0, "Grapes");
		System.out.println(linkedList);

	}
}