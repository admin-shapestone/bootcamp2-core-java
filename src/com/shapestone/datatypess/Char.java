package com.shapestone.datatypess;

public class Char {
	char c;
	static char l = 'o';

	public static void main(String[] args) {
		char v = 'l';
		Char obj = new Char();
		obj.c = 'c';
		System.out.println(obj.c + " " + l + " " + l + " " + v);
	}

}
