package dublicatestring;

import java.util.Scanner;

public class DublicateElementsInA_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(str.charAt(i) + " ");
			}
		}

	}

}
