package com.shapestone.files;

public class Student {
	
	private String name;
	private String course;
	private String phoneNumber;
	private Address address;
	private String[] hobies;
		
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", cource=" + course + ", phoneNumber=" + phoneNumber + "]";
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getCourse() {
		return course;
	}
	protected void setCourse(String course) {
		this.course = course;
	}
	protected String getPhoneNumber() {
		return phoneNumber;
	}
	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	protected Address getAddress() {
		return address;
	}
	protected void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
