import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayInAsscendingOrder {

	public static void main(String[] args) {

		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your elements:");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(Arrays.toString(array) + " ");

	}

}
