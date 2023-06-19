package com.shapestone.encapsulation;

public class Student {
private	int rollNumber;
private	String name;
private	boolean isAttended;

public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}

	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setStudentAttendence(boolean flag) {
		if (!isAttended)
			isAttended = flag;
		System.out.println("teacher assigned attendence to student");
	}

	public boolean getStudentAttendence() {
		System.out.println("teacher accessed student attendence");
		return isAttended;
	}
}
