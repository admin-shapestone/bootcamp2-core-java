package maxarray;

public class MaxNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 8, 54, 3, 4, 1 };
		int temp = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}