package com.shapestone.constructor;

class Parameterized {

	// Instance Variable

	int student;
	String name;
	double fee;

	// Parameterized Constructor
	public Parameterized(int stndid, String stndname, double stndfee) {
		student = stndid;
		name = stndname;
		fee = stndfee;
	}

	public void getStudentDetails() {
		System.out.println("StudentId:" + student);
		System.out.println("Studentname:" + name);
		System.out.println("Studentfee:" + fee);
	}

	public static void main(String[] args) {
		Parameterized s = new Parameterized(786, "Nitish", 45000.65);
		s.getStudentDetails();
	}
}
