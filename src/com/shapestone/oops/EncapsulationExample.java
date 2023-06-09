package com.shapestone.oops;

public class EncapsulationExample {

	private int studentId;
	private String studentName;
	private double studentFee;

	void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	int getStudentId() {
		return studentId;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	String getStudentName() {
		return studentName;
	}

	void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}

	double getStudentFee() {
		return studentFee;
	}

	void display() {
		System.out.println("student id : " + studentId);
		System.out.println("student name : " + studentName);
		System.out.println("student fee : " + studentFee);
	}

	public static void main(String[] args) {

		EncapsulationExample e = new EncapsulationExample();
		e.setStudentId(101);
		e.setStudentName("abhilash");
		e.setStudentFee(100000.27);
		e.display();

	}

}
