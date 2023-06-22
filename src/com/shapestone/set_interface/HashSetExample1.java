package com.shapestone.set_interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	/*
	 * underlying data structure is hashtable it implements serilizable and
	 * cloneable
	 */

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add(10);
		set.add(20);
		set.add(10);// Duplicate are not alloewd.if added duplicate objects id does throw C.T.E.but
					// we can't get the data
		set.add(20);
		set.add("abhi");// Heterogeneous objects are allowed
		set.add(null);// Null insertion is possible only once

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());// insertion order is not preserved because objects are based on hashcode.
		}

	}

}
