package com.shapestone.travelportal;

public class TotalAmount {

	private int passengerId;
	private String passengerName;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	private int age;
	private String gender;
	private String dateOfJourney;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	@Override
	public String toString() {
		return "TotalAmount [passengerId=" + passengerId + ", passangersName=" + passengerName + ", age=" + age
				+ ", gender=" + gender + ", dateOfJourney=" + dateOfJourney + "]";
	}
}
