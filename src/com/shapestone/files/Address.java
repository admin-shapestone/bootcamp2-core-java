package com.shapestone.files;

public class Address {

	private String line;
	private String village;
	private String mandal;
	private String district;
	private int pincode;

	@Override
	public String toString() {
		return " [line=" + line + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
