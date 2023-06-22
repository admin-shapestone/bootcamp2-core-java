package com.shapestone.set_interface;

import java.util.HashSet;
import java.util.Iterator;

public class MainHashSet {

	public static void main(String[] args) {
		HashSet<HashSetExample2> set = new HashSet();

		set.add(new HashSetExample2("abhi", 101, new Address("hyd")));
		set.add(new HashSetExample2("akshay", 102, new Address("bihar")));
		set.add(new HashSetExample2("gopi", 103, new Address("banglor")));
		set.add(new HashSetExample2("funny", 104, new Address("pune")));
		set.add(new HashSetExample2("nitish", 105, new Address("Ap")));

		Iterator<HashSetExample2> itr = set.iterator();
		while (itr.hasNext()) {
			HashSetExample2 example2 = itr.next();
			System.out.println("name = " + example2.getName() + " id = " + example2.getId() + " Address  = "
					+ example2.getAddress().getAddress());
		}

	}

}
