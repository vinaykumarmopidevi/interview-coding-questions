package sample;

public class SortArrayExample {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 4, 33, -2, 3, -56, 43, 34, -17, 41 };
		for (int i = 0; i < arr.length; i++) {
			int tmp=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp ;
				}
			}
		}
		for (int value : arr) {
			System.out.print(" " + value);

		}
	}
}