package com.shapestone.jsonfiles;

public class EmployeeDetailes {
	private String employeName;
	private int id;
	private String department;
	private String bloodGroup;
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "EmployeeDetailes [employeName=" + employeName + ", id=" + id + ", department=" + department
				+ ", bloodGroup=" + bloodGroup + "]";
	}
}
	
	
	
