package com.shapestone.travelportal;

import java.sql.Date;
import java.util.stream.Stream;

public class PassengerDetails {

	private int passengerId;
	private String passengerName;
	private int age;
	private String gender;

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	private float totalAmount;

	

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

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

	

	public void setTotalPrice(float price) {
		this.totalAmount = price;
	}

	public float getTotalPrice() {
		return this.totalAmount;
	}

	@Override
	public String toString() {
		return "totalAmount [passengerId=" + passengerId + ", passangersName=" + passengerName + ", age=" + age
				+ ", gender=" + gender + ", totalAmount=" + totalAmount + "]";
	}

}