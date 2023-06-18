package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListExpF {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");

		int bananaIndex = list.indexOf("Banana");
		System.out.println("Index of 'Banana': " + bananaIndex);

	}

}
