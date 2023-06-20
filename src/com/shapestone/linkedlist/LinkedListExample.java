package com.shapestone.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Nagesh");
		al.add("Akshay");
		al.add("Abhi");

		LinkedList<String> ll = new LinkedList<>();
		ll.add("nitish");
		ll.add("Gopi");
		ll.add("PhaniRama");
		ll.addAll(0, al);
		ll.remove(1);
		ll.set(2, "Naresh");
		System.out.println(ll);

	}

}
