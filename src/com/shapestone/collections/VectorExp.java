package com.shapestone.collections;

import java.util.Vector;

public class VectorExp {

	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add("phani");
		v.add("nagesh");
		v.add(0, "Nitish");
		v.add("gopi"); 
		v.add(1, "akshy");
		v.add("aaB");
		v.add("SHAPESTONE");
		Vector<String> v1 = new Vector();
		v1.add("hahahaha");
		v1.add("hehheheeh");
		v1.add("laka laka laka...");
		v.addAll(v1);
		System.out.println(v);
		System.out.println(v1);
		System.out.println("Size :" + v.size());// no elements present in the list.
		System.out.println("Capacity :" + v.capacity());// Array Capacity
		System.out.println(v.get(6));
		v.remove("hehheheeh");
		v.remove(7);
		v1.removeAll(v1);
		System.out.println(v);
		System.out.println(v1);
		System.out.println(v.contains("Nitish"));
		System.out.println(v.contains("phani rama"));
		System.out.println(v.containsAll(v1));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
}
