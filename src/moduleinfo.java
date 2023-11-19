import java.util.Arrays;

class moduleinfo {
	static void fnone(int[] arr) {
		Arrays.sort(arr);
		int current = arr[0];
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (current != arr[i]) {
				sum += arr[i];
			}
			current = arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3,5 };
		fnone(arr);

	}
}