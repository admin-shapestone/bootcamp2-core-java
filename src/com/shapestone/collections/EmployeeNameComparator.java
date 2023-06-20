package com.shapestone.collections;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getName().equals(o2.getName())) {
			return (int) (o1.getEmpId() - o2.getEmpId());
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
