package sample;

public class FindBigValueTwoArrayExample {

	public static void main(String[] args) {
		FindBigValueTwoArrayExample m = new FindBigValueTwoArrayExample();
		int[] arr1 = { 49, 45, 23, 95, 55, 39, 20 };
		int[] arr2 = { 49, 10, 75, 99, 65, 39, 14 };
		m.sortedArray(arr1);
		m.sortedArray(arr2);

		if (arr1[0] > arr2[0]) {
			System.out.println(" arr1 value is big " + arr1[0]);
		} else {
			System.out.println(" arr2 value is big " + arr2[0]);
		}
	}

	public void sortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

	}

}
