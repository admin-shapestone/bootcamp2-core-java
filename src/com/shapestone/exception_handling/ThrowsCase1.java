package com.shapestone.exception_handling;

public class ThrowsCase1 {

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(1000);
	}
}

/*
 * public class ThrowsCase1 {
 * 
 * public static void main(String[] args) { try {
 * 
 * Thread.sleep(1000); } catch (InterruptedException ie ) {
 * System.out.println(ie); } }
 * 
 * }
 */