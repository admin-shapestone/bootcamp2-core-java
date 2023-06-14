package com.shapestone.encapsulationprograms;

public class Employee {
	private String name;
	private int age;
	private double salary;

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
		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("Invalid age!");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary!");
		}
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("phani rama ");
		employee.setAge(25);
		employee.setSalary(26000.00);

		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Salary: " + employee.getSalary());
	}
}