package com.shapestone.collections;

import java.util.ArrayList;

public class ArrayListExpH {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Pawan Kalyan");
		list.add("Ballaya Babu");
		list.add("Chiranjeevi");
		list.add("NTR");
		list.add("Prabhas");
		list.add("Mahesh Babu");
		System.out.println(list);
		ArrayList list1 = new ArrayList();
		list1.add("Anushka");
		list1.add("Kajal");
		list1.add("Dishapatani");
		list1.add("Sreeleela");
		System.out.println(list1);
		list1.add(list);
		System.out.println(list1);
		System.out.println(list1.get(3));
		System.out.println(list.indexOf("NTR"));
		System.out.println(list.size());
		list.add(0, "TFI Bagundali");
		System.out.println(list1.remove(2));
		System.out.println(list.isEmpty());
		System.out.println(list1.equals(list));
		System.out.println(list.hashCode());

	}

}
