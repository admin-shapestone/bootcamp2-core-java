package com.shapestone.datatypess;

public class IntEx {
	int c;
	static int n = 10;

	public static void main(String[] args) {
		int r = 76;
		IntEx obj = new IntEx();
		obj.c = 36;
		byte j = (byte) (n + obj.c);
		int l = r - j;
		System.out.println(r + "  " + n + "  " + obj.c + "  " + j + "  " + l);

	}

}
