package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListExpB {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.add(3);

		System.out.println("Elements in list2: " + list2);

	}

}
