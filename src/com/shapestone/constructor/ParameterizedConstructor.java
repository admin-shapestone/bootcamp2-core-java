package com.shapestone.constructor;

public class ParameterizedConstructor {

	private int empId;
	private String name;
	private double salrey;

	ParameterizedConstructor(int empId, String name, double salrey) {
		this.empId = empId;
		this.name = name;
		this.salrey = salrey;
	}

	void display() {
		System.out.println("EmpId = " + empId);
		System.out.println("Emp name = " + name);
		System.out.println("EmpId = " + salrey);
	}

	public static void main(String[] args) {
		ParameterizedConstructor A = new ParameterizedConstructor(101, "abhilash", 500000.24);
		ParameterizedConstructor N = new ParameterizedConstructor(102, "Nitish", 500000.24);
		ParameterizedConstructor a = new ParameterizedConstructor(103, "Akshay", 500000.24);
		ParameterizedConstructor p = new ParameterizedConstructor(104, "Phani", 500000.24);
		ParameterizedConstructor G = new ParameterizedConstructor(105, "Gopi", 500000.24);
		ParameterizedConstructor n = new ParameterizedConstructor(106, "Gopi", 500000.24);

		A.display();
		N.display();
		a.display();
		p.display();
		G.display();
		n.display();
	}

}
