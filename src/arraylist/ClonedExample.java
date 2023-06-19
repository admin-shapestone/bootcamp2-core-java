package arraylist;

import java.util.*;

final class ClonedExample {

	public static void main(String[] args) {
		ArrayList<String> originalList = new ArrayList<>();
		originalList.add("Hr");
		originalList.add("Admin");
		originalList.add("Sales");

		ArrayList<String> ClonedList = (ArrayList<String>) originalList.clone();
		System.out.println("originalList :" + originalList);
		System.out.println("ClonedList :" + ClonedList);

	}

}
