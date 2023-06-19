package com.shapestone.constructor;

class ZeroConstructor {

	ZeroConstructor() {
		System.out.println("zero arguments constructor");

	}

	public static void main(String[] args)

	{
		System.out.println("main ");
		ZeroConstructor z = new ZeroConstructor();
	}

}
