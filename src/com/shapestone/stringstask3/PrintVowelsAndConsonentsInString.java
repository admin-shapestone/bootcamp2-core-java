package com.shapestone.stringstask3;

public class PrintVowelsAndConsonentsInString {

	public static void main(String[] args) {
		String str = "with the help of heap object referance.we can refer scp object by sing intern method";
		int voewlsCount = 0;
		int consonentCount = 0;
		String toLowerCase = str.toLowerCase();
		for (int i = 0; i <= toLowerCase.length() - 1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				voewlsCount++;
				// System.out.print(str.charAt(i) + " ");
			}

			else
				consonentCount++;
			// System.out.print(str.charAt(i) + " ");

		}
		// System.out.println("Vowels Count : : " + voewlsCount + "Consonents count : :
		// " + consonentCount);
		System.out.printf("Vowels Count: %d%nConsonants Count: %d%n", voewlsCount, consonentCount);

	}

}
