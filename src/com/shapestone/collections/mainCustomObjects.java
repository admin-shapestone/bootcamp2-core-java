package com.shapestone.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mainCustomObjects {

	public static void main(String[] args) {

		List<CustomObjectsInArrayList> list = new ArrayList();
		list.add(new CustomObjectsInArrayList("abhi", 1, "ppc"));
		list.add(new CustomObjectsInArrayList("funny", 2, "Abc"));

		list.add(new CustomObjectsInArrayList("akshay", 3, "zphs"));
		list.add(new CustomObjectsInArrayList("nitish", 4, "shpz"));
		list.add(new CustomObjectsInArrayList("nitish", 4, "shpz"));
		Iterator<CustomObjectsInArrayList> itr = list.iterator();
		while (itr.hasNext()) {
			CustomObjectsInArrayList arrayList	=itr.next();
			System.out.println("name  = "+arrayList.getName()+"  Id = "+arrayList.getId()+"  school = "+arrayList.getSchool());
		}	

	}

}
