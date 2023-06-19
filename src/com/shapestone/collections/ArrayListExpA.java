package com.shapestone.collections;
import java.util.ArrayList;
public class ArrayListExpA {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 10);
        numbers.add(1, 20);
        numbers.add(2, 30);

        System.out.println("Number at index 0: " + numbers.get(0));
        System.out.println("Number at index 1: " + numbers.get(1));
        System.out.println("Number at index 2: " + numbers.get(2));

	}

}
