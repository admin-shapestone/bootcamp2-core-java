package com.shapestone.comparable;

public class Employee implements Comparable<Employee> {

	private String name;
	private int empId;

	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	public Employee(String name, int empId) {

		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getName().equals(o.getName())) {
			return this.empId - o.getEmpId();
		} else {
			return this.empId - o.getEmpId();
		}
	}

}
