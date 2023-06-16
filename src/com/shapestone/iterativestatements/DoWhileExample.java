package com.shapestone.iterativestatements;

public class DoWhileExample {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println("count: " + count);
			count++;
		} while (count < 5);
	}
}