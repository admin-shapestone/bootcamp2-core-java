package com.shapestone.stringstask3;

public class RemoveSpecialCharacterInAString {

	public static void main(String[] args) {
		String str = "$%$##%S&&h^^ape&&*st(((*o%%n@@!E";

		str = str.replaceAll("[^a-z,0-9,A-Z]", "");
		System.out.println(str);
	}

}
