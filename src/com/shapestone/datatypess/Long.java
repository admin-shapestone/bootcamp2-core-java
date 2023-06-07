package com.shapestone.datatypess;

public class Long {
	long l;
	static long o = 999;

	public static void main(String[] args) {
		long ll = 9999;
		Long obj = new Long();
		obj.l = 99;
		long d = (long) +(ll + obj.l);
		System.out.println(o + "  " + obj.l + "  " + ll + "  " + d);

	}

}
