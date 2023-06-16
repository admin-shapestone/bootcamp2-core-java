package com.shapestone.datatypess;

public class LongEx {
	long l;
	static long o = 999;

	public static void main(String[] args) {
		long ll = 9999;
		LongEx obj = new LongEx();
		obj.l = 99;
		long d = (long) +(ll + obj.l);
		System.out.println(o + "  " + obj.l + "  " + ll + "  " + d);

	}

}
