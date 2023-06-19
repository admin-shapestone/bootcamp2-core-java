package com.shapestone.collectionpractice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> all= new ArrayList<>();
       all.add(5);
       all.add(0,10);
       System.out.println(all);
       System.out.println(all.size());

	}
}
