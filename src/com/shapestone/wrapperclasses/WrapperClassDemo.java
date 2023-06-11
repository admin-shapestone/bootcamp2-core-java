package com.shapestone.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {
		WrapperClassDemo demo = new WrapperClassDemo();
		
//		byte b = 128;
		Byte byte1 = new Byte((byte)127); //Byte.valueOf(127);
		Byte byte2 = Byte.parseByte("127");
		
		
		byte b = 10;
		Byte byte3 = b; //Byte.valueOf(b)
		b = byte3; // Byte.byteValue();
		
		System.out.println(byte1.byteValue());
		System.out.println(byte1.shortValue());
		System.out.println(byte1.intValue());
		System.out.println(byte1.doubleValue());
		System.out.println(byte1.floatValue());
		System.out.println(byte1.longValue());
		//xxxValue();
		
		
		Short short1 = new Short("256");
		short1.doubleValue();
		
		
		Integer in1 = Integer.valueOf(127);
		Integer in2 = Integer.valueOf(12);
		System.out.println(in1 == in2);
		
		
	}

}
