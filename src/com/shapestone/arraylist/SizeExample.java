package com.shapestone.arraylist;

import java.util.*;

public class SizeExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		int capacity = list.size();

		System.out.println("capacity before ensure capacity : " + capacity);
		list.ensureCapacity(10);
		capacity = list.size();
		System.out.println("capacity after ensuru capacity :" + capacity);
		System.out.println("before clear :"+ list);
		list.clear();
		System.out.println("After clear :"+list);
		

	}

}
