package sample;

public class AddTwoNumInArrMatchWithTarget {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 8, 5, 3, 8, 3, 1, 9, 7, 4, 2 };
		int target = 6;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == target) {
					System.out
							.println("value : " + arr[i] + " Index : " + i + " |  value : " + arr[j] + " Index : " + j);
				}

			}
		}
	}

}
