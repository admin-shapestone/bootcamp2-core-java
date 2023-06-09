package com.shapestone.stringstask3;

public class Concat_Example {

	public static void main(String[] args) {
		String str1 = "shape";// String are immutable.
		str1.concat("stone");
		System.out.println(str1);
		String str2 = new String("shape");
		String s3 = str2.concat(str1);
		System.out.println(s3);

		// Example 2.
		String s1 = new String("spring");
		s1.concat("fall");
		String s2 = s1.concat("winter");
		s2.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
