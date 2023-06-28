package com.shapestone.travelportal;

public class BookingDetails {
	private int slNo;
	private int passengerId;
	private String originCity;
	private String destinationCity;
	private int distance;
	private String modeOfTransport;
	private float pricePerKm;
	private float totalTravelPrice;
	
		

	@Override
	public String toString() {
		return "Booking [slNo=" + slNo + ", passengerId=" + passengerId + ", originCity=" + originCity
				+ ", destinationCity=" + destinationCity + ", distance=" + distance + ", modeOfTransport="
				+ modeOfTransport + ", pricePerKm=" + pricePerKm +",totalTravelPrice="+totalTravelPrice+ "]";
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public float getPricePerKm() {
		return pricePerKm;
	}

	public void setPricePerKm(float pricePerKm) {
		this.pricePerKm = pricePerKm;
	}
	public void settotalTravelPrice(float pr)
	{
		this.totalTravelPrice=pr;
		
	}
	public float gettotalTravelPrice() {return this.totalTravelPrice;}

}