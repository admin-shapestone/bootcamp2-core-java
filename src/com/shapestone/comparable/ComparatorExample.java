package com.shapestone.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet  list = new TreeSet(new MyComparator());
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println(list);
	}

}

class MyComparator implements Comparator
{
     @Override
	public int compare(Object o1, Object o2) {
		String str1 =   o1.toString();
		String str2 =   o2.toString();
		
		
		
		return -str1.compareTo(str2);
		
	}
	
}
