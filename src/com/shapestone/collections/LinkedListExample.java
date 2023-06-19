package com.shapestone.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	/*
	 * The underlaying data structure is doubley linked list where insertion is
	 * preserved Duplicates are allowed Null insertion is possible Hetrogenus
	 * objects are allowed It implements serilizable and clonable but not
	 * randomAccess if our frequent operation insert/delete in the middle LinkedList
	 * is best choice. if our frequent operation is select/Retrive it is not a best
	 * choice usually we use Linked list to implements stack and queue. The methods
	 * which are present in linked list are - addFirst() addLast() removeFirst()
	 * RemoveLast() getFirst() getLast()
	 */
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("s");
		list.add("h");
		list.add("a");
		list.add("p");
		list.add("e");
		list.addFirst("y");
		list.addLast("stone");
		list.add("y");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.removeFirst();
		list.removeLast();
		System.out.println(list);

		// Iterating a List for (String string : list) { System.out.println(string);
	}

}
