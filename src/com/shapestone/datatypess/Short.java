package com.shapestone.datatypess;

public class Short {
	short o;
	static byte y = 22;

	public static void main(String[] args) {
		short e = 11;
		Short obj = new Short();
		obj.o = 33;
		short ee = (short) (y + e);
		short u = (short) (obj.o - e);
		System.out.println(obj.o + " " + y + " " + ee + " " + u);

	}

}
