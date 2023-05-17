package com.shapestone.arrays;

public class DulicateElementsInAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 6, 4, 7, 5, 6, 5 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("dublicate elements are" + arr[i]);
				}
			}
		}

	}
}
