package com.shapestone.studentmanagement;

public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;
	private String studentGender;
	private String studentDateOfJoining;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentDateOfJoining() {
		return studentDateOfJoining;
	}
	public void setStudentDateOfJoining(String studentDateOfJoining) {
		this.studentDateOfJoining = studentDateOfJoining;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentGender=" + studentGender + ", studentDateOfJoining=" + studentDateOfJoining
				+ ", studentAddress=" + studentAddress + "]";
	}
	
}
