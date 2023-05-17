package com.shapestone.operators;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	private String name;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Employee(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}	
	
}
class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
