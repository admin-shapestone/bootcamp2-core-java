package com.shapestone.wrapperclasses;

public class BoxingUnBoxing {
	public static void main(String[] args) {

		int a = 333;
		Integer num = new Integer(a);// boxing
//	Integer nn=a;// auto -boxing
//	System.out.println(nn);
		int num1 = num.intValue();
		System.out.println(num1);// un- boxing

		float f = 33.3f;
		Float ff = new Float(f);// boxing
		System.out.println(ff);

	}
}