package smallnumberarray;

public class SmallNumber {

	public static void main(String[] args) {
		int[] arr = { 36, 78, 9, 7, 6, 4, 2, 21 };
		int temp = 0;
		int small = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(small);

	}

}
