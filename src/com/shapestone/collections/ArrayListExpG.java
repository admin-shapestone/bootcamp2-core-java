package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListExpG {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		list.remove(0);
		list.remove("Banana");

		System.out.println("Elements in list after removing: " + list);

	}

}
