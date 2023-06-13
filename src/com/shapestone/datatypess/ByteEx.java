package com.shapestone.datatypess;

public class ByteEx {
	byte b;

	static byte c = 19;

	public static void main(String[] args) {
		byte h = 16;
		byte k = 55;
		byte o = (byte) (h + k);
		ByteEx obj = new ByteEx();
		obj.b = 83;
		System.out.println(obj.b + "  " + h + "  " + c + " " + o + " " + k);
	}

}
