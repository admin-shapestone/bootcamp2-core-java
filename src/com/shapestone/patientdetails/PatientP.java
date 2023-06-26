package com.shapestone.patientdetails;

public class PatientP {
	private String name;
	private int id;
	private int age;
	private String gender;
	private String dateofadmission;

	@Override
	public String toString() {
		return "PatientP [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", dateofadmission="
				+ dateofadmission + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofadmission() {
		return dateofadmission;
	}
	public void setDateofadmission(String dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
}
