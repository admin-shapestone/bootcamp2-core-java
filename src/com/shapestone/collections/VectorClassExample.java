package com.shapestone.collections;

import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.capacity());// default capacity of vector is 10.
		vector.addElement(2);
		vector.add(0, 1);
		System.out.println(vector.elementAt(0));
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		Vector vector1 = new Vector();
		vector1.addAll(vector);
		System.out.println(vector1);
		System.out.println(vector.removeAll(vector1));

	}

}
