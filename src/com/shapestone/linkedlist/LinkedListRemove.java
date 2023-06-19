package com.shapestone.linkedlist;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		linkedList.remove(1);
		System.out.println(linkedList);

	}
}