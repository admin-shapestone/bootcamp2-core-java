package com.shapestone.files;

public class Address {
	
	private String line;
	private String village;
	private String mandal;
	private String district;
	private int pincode;
	
	
	protected String getLine() {
		return line;
	}
	protected void setLine(String line) {
		this.line = line;
	}
	protected String getVillage() {
		return village;
	}
	protected void setVillage(String village) {
		this.village = village;
	}
	protected String getMandal() {
		return mandal;
	}
	protected void setMandal(String mandal) {
		this.mandal = mandal;
	}
	protected String getDistrict() {
		return district;
	}
	protected void setDistrict(String district) {
		this.district = district;
	}
	protected int getPincode() {
		return pincode;
	}
	protected void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [line=" + line + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}
	
	
	

}
