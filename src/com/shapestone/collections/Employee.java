package com.shapestone.collections;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private long empId;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected long getEmpId() {
		return empId;
	}
	protected void setEmpId(long empId) {
		this.empId = empId;
	}
	public Employee(String name, long empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	/**
	 * Method to sort employees based on emp name,
	 *  if names are equal sort based on emp id
	 */
	@Override
	public int compareTo(Employee o) {
		if (o != null && this != null) {
			if (this.getName().equals(o.getName())) {
				return (int) (this.getEmpId()-  o.getEmpId());
			}
			else
			{
				return this.getName().compareTo(o.getName());
			}
		}
		return 0;
		
	}
	
	

}
