package com.shapestone.collections;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getEmpId() - o2.getEmpId());
	}

}
