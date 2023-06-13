package com.shapestone.string;

public class Format {

	public static void main(String[] args) {
		String name = "nithish";
		String s1 = String.format("name is %s", name);
		String s2 = String.format("Age is %d", 22);
		String s3 = String.format("salery is %f", 30.000);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
