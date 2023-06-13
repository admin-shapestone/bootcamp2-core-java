package com.shapestone.ExceptionHandling;

public class CatchMultiple {

	public static void main(String[] args) {
		try {
			int[] i = { 1, 2, 3, 4, 5 };
			System.out.println(i[5]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("remaining code ");
	}

}  // multiple catch will have higher priority goes to child to parent. not parent to child
