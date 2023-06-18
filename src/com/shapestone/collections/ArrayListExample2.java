package com.shapestone.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		// sorting an arraylist

		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		Collections.sort(al);

		System.out.println(al);

		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(32);
		al1.add(55);
		al1.add(55);
		al1.add(23);
		al1.add(2, 4);// adding element in specfic index.
		System.out.println(al.contains("Apple"));
		Collections.sort(al1);

		System.out.println(al1);
		al1.clear();// it returns empty list.
		System.out.println(al1);

	}

}
