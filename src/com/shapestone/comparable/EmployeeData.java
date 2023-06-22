package com.shapestone.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {

	public static void main(String[] args) {
		ArrayList <Employee> alist = new ArrayList<>();
		 
		 alist.add(new Employee("funny",44));
		 alist.add(new Employee("akshay",21)); 
		 alist.add(new Employee("gopi",111));
		 alist.add(new Employee("gopi",111));
		 alist.add(new Employee("abhi",45));
		 Collections.sort(alist);
		System.out.println(alist);
		
		System.out.println("----------------------------------------------------------------");
		
	}

}
