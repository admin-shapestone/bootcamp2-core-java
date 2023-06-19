package com.shapestone.arraylist;

import java.util.*;

public class AddAllExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("grapes");

		boolean containsapple = list.contains("apple");
		System.out.println("containsapple : " + containsapple);
		boolean containsgoua = list.contains("goua");
		System.out.println("contaonsgoua : " + containsgoua);
	}

}
