package arrayasscending;

public class ArrayAsscending {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 7, 4, 8, 4, 3 };
		int temp = 0;

		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();
		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
