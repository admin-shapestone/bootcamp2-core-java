package com.shapestone.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("m");
		al.add(10);
		al.add(null);// null insertion is possible.
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "m");// duplicates are allow.
		al.add("N");
		System.out.println(al);// insertion order is preserved.

		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		LinkedList ll = new LinkedList();
		System.out.println(ll instanceof RandomAccess);
		
		/*
		 * Only Arraylist and vecto classes implements RandomAccess interface. For every
		 * collection objects Serilizable and clonable interface implements for every
		 * collection classes.
		 */
	}

}
