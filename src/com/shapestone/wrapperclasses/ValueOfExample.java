package com.shapestone.wrapperclasses;

public class ValueOfExample {

	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		System.out.println(i1 == i2);

		Integer I1 = Integer.valueOf(10);
		Integer I2 = Integer.valueOf("10");
		System.out.println(I1 == I2);

		Integer i = Integer.valueOf("1111", 2);
		System.out.println("the decimal num of binary form is =  " + i);
		
		String s1 = Integer.toBinaryString(15);
		String s2 =Integer.toOctalString(15);
		String s3 =Integer.toHexString(15);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
