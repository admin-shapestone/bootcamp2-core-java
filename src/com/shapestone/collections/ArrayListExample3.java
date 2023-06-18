package com.shapestone.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(32);
		al.add(55);
		al.add(55);
		al.add(23);
		al.add(2, 4);
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		ArrayList al1 = new ArrayList();

		al1.addAll(al);

		System.out.println(al1);
		al1.addAll(2, al1);
		System.out.println(al1);
		System.out.println(al1.get(1));
		System.out.println(al1.set(0, "shapestone"));
		System.out.println(al1);
		System.out.println(al1.remove(0));
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.equals(al));
		System.out.println(al1.indexOf("Apple"));
		System.out.println(al1.isEmpty());

		System.out.println(al1.removeAll(al));

		System.out.println(al.hashCode());

	}

}
