package sumofarrays;

public class SumOfArray {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 1, 34, 6, 7, 88, 7 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
