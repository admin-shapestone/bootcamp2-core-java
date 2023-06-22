package com.shapestone.comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new MyComparator());
		for (int i = 1; i < 10; i++) {
			set.add(i);
		}
		System.out.println(set);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else
			return 0;
	}

}
