package com.shapestone.datatypess;

public class CharEx {
	char c;
	static char l = 'o';

	public static void main(String[] args) {
		char v = 'l';
		CharEx obj = new CharEx();
		obj.c = 'c';
		System.out.println(obj.c + " " + l + " " + l + " " + v);
	}

}
