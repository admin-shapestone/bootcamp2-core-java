package com.shapestone.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student s = new Student(101);
		s.setStudentAttendence(true);
		s.getStudentAttendence();
	}
}