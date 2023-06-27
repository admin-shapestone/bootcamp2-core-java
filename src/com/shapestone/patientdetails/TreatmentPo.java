package com.shapestone.patientdetails;

public class TreatmentP {
	private int serialno;
	private int patientId;
	private String diagnosis;
	private String treatment;
	private String dateoftreatment;
	private int scanningBill;
	private int doctorfee;
	private int medicines;



	@Override
	public String toString() {
		return "TreatmentP [serialno=" + serialno + ", id=" + patientId + ", diagnosis=" + diagnosis + ", treatment="
				+ treatment + ", dateoftreatment=" + dateoftreatment + ", scanningBill=" + scanningBill + ", doctorfee="
				+ doctorfee + ", medicines=" + medicines + "]";
	}

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getDateoftreatment() {
		return dateoftreatment;
	}

	public void setDateoftreatment(String dateoftreatment) {
		this.dateoftreatment = dateoftreatment;
	}

	public int getScanningBill() {
		return scanningBill;
	}

	public void setScanningBill(int scanningBill) {
		this.scanningBill = scanningBill;
	}

	public int getDoctorfee() {
		return doctorfee;
	}

	public void setDoctorfee(int doctorfee) {
		this.doctorfee = doctorfee;
	}

	public int getMedicines() {
		return medicines;
	}

	public void setMedicines(int medicines) {
		this.medicines = medicines;
	}

}
