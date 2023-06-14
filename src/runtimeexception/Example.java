package runtimeexception;

public class Example {
	public static void main(String... args) {
		int a = 10;
		int b = 0;

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("these block from ctach ");
			System.out.println(e);
		}
		try {
			int[] arr = { 1, 2, 3, 4, 5 };

			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}

}
