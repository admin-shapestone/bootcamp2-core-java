package custom_exceptions;

import java.util.Scanner;

public class UserDefinedCheckedException {

	static void status(int age) throws InvalidAgeException {
		if (age > 28) {
			System.out.print("he/she elgibal foe marriage");

		} else {

			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) throws InvalidAgeException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		UserDefinedCheckedException.status(age);

	}

}
