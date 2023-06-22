package com.shapestone.set_interface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample1 {
	/*
	 * W.A.P to insert string objects into the treeset where the sorting order is
	 * reverse of alphabetical order
	 */
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet(new MyComparator());
		set.add("t");
		set.add("a");
		set.add("v");
		set.add("k");
		set.add("u");
		set.add("a");//Duplicate are not allowed.
		//set.add(null); null is not possible.if we perform null operation we will get null pointer exception.
		System.out.println(set);//insertion order is not preserved.because objects are based on Asscending order.
	}

}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String str1 = obj1.toString();
		String str2 = obj2.toString();

		return -str1.compareTo(str2);
	}
}