package com.shapestone.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class WaysToIterateA_CollectionObject {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		list.add("10");
		list.add("1");
		list.add("5");
		list.add("6");
		list.add("4");
		list.add("4");
		list.add("2");
		list.add("3");

		// USING ITERATOR
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------");
		// Using for each loop
		for (

		String s : list) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		// Using list Iterator
		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

	}
}
