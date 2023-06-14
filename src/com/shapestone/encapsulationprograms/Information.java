package com.shapestone.encapsulationprograms;

public class Information {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Information student = new Information();
		student.setName("phani rama");
		student.setAge(25);

		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
	}
}