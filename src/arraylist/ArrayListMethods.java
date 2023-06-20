package arraylist;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	
	list.add("java");
	list.add("python");
	list.add("cloud");
	list.add("testing");
	System.out.println(list);
	
	String element = list.get(3);
	System.out.println("element at index 3 : " +element);
	
	}

}
