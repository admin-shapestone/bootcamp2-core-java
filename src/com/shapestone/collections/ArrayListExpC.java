package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListExpC {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Rest in Peace");
		list.add("Rakesh Master");

		System.out.println("Elements in list: " + list);

		list.clear();

		System.out.println("Elements in list after clearing: " + list);

	}

}
