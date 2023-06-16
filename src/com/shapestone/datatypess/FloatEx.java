package com.shapestone.datatypess;

public class FloatEx {
	float g;
	static float j = 999.9f;

	public static void main(String[] args) {
		float d = 7777.66f;
		float y = 6666.55f;
		FloatEx obj = new FloatEx();
		float t = (float) (y + d);
		obj.g = 77.3f;
		System.out.println(obj.g + "  " + j + "  " + y + "  " + t);

	}

}
