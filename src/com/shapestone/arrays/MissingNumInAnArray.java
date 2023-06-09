package com.shapestone.arrays;

public class MissingNumInAnArray {

	public static void main(String[] args) {

		{
			int arr[] = { 1, 2, 3, 5, 7, 8, 9 };

			int size[] = new int[10];
			for (int index : arr) {
				size[index] = 1;
			}
			for (int i = 1; i < size.length; i++) {
				if (size[i] == 0) {
					System.out.print(i + " ");
				}
			}

		}
	}
}
