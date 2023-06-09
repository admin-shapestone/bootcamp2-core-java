package com.shapestone.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		for (char i = 'D'; i >= 'A'; i--) {
			for (char j = 'A'; j <= 'D'; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
