package custom_exceptions;

import java.util.Scanner;

public class UserDefinedUnCheckedException {

	static void status(int age) 
	{
		if(age>18) 
		{
			System.out.print("he/she elgible for vote");
		}
		else 
		{
			throw new InvalidAgeException("not elgibal for vote");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		UserDefinedUnCheckedException.status(age);

	}

}
