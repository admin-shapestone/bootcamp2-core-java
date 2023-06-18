package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListE {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");

		boolean containsApple = list.contains("Apple");
		System.out.println("Does list contain 'Apple'? " + containsApple);

	}

}
