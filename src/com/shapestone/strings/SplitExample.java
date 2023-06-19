package com.shapestone.strings;

public class SplitExample {
	public static void main(String[] args) {
		String s1 = "phani sri rama";
		String[] words = s1.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
	}
}