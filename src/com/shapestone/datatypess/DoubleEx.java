package com.shapestone.datatypess;

public class DoubleEx{
	double h;
	static double k = 888.d;

	public static void main(String[] args) {
		double y = 8888.d;
		double m = 786.d;
		DoubleEx obj = new DoubleEx();
		obj.h = 8888;
		double z = (double) (obj.h + y);
		double x = m * k;
		System.out.println(y + "  " + m + "  " + obj.h + "  " + z + "  " + x);

	}

}
