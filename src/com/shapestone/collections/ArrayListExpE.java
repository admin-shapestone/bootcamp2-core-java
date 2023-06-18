package com.shapestone.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExpE {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);

		Collections.sort(numbers);
		List<Integer> sublist = numbers.subList(0,3);

		System.out.println("Elements in sorted order: " + numbers);
		System.out.println("Sublist: " + sublist);

	}

}
