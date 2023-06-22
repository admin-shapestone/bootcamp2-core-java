package com.shapestone.patientdetails;

public class TreatmentP {
	private String serialno;
	private String id;
	private String diagnosis;
	private String treatment;
	private String dateoftreatment;
	private int scanningBill;
	private int doctorfee;
	private int medicines;

	@Override
	public String toString() {
		return "TreatmentPojo [serialno=" + serialno + ", id=" + id + ", diagnosis=" + diagnosis + ", treatment="
				+ treatment + ", dateoftreatment=" + dateoftreatment + ", cost=" + ", scanningBill=" + scanningBill
				+ ", doctorfee=" + doctorfee + ", medicines=" + medicines + "]";
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
