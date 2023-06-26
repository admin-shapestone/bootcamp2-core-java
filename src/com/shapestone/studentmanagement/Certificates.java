package com.shapestone.studentmanagement;

public class Certificates {
	private int slno;
	private int studentId;
	private String certification;
	private float fees;
	private String DateOfCertificationDone;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getDateOfCertificationDone() {
		return DateOfCertificationDone;
	}
	public void setDateOfCertificationDone(String dateOfCertificationDone) {
		DateOfCertificationDone = dateOfCertificationDone;
	}
	@Override
	public String toString() {
		return "Certificates [slno=" + slno + ", studentId=" + studentId + ", certification=" + certification
				+ ", fees=" + fees + ", DateOfCertificationDone=" + DateOfCertificationDone + "]";
	}
	

}
