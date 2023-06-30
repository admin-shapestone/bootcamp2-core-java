package com.shapestone.studentmanagement;

import java.util.Date;

public class Certificates {
	private int slno;
	private int studentId;
	private String certification;
	private int fee;
    private Date dateOfCertificationDone;
	public int getSlno() {
		return slno;
	}
	public Date getDateOfCertificationDone() {
		return dateOfCertificationDone;
	}
	public void setDateOfCertificationDone(Date dateOfCertificationDone) {
		this.dateOfCertificationDone = dateOfCertificationDone;
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
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Certificates [slno=" + slno + ", studentId=" + studentId + ", certification=" + certification + ", fee="
				+ fee + ", dateOfCertificationDone=" + dateOfCertificationDone + "]";
	}
    
}