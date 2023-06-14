package runtimeexception;

public class Exampletwo {

	public static void main(String[] args) {
		String str = null;
		try {
			if (str.equals("std")) {
				System.out.println("is same ");
			} else {
				System.out.println("is no same");
			}
		} catch (NullPointerException n) {
			System.out.println("null pointer will catched");
		} finally {
			System.out.println("thse is finl block");
		}
	}

}
