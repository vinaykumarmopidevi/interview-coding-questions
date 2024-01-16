package sample;

public class ReversStrWithoutAffectingAnySpecialCharAndNumbers {
	// Reversing string without affecting any special characters
	// input:Aj@y@23Gundet!
	// output:te@d@23nuGyA!
	public static void main(String[] args) {

		String str = "Aj@y@23Gundet!";

		System.out.println("Original String : " + str);

		str = new ReversStrWithoutAffectingAnySpecialCharAndNumbers().reverseString(str);

		System.out.println("Reversed String : " + str);
	}

	public String reverseString(String str) {

		char[] arr = str.toCharArray();

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (!Character.isLetter(arr[start])) {
				start++;
			} else if (!Character.isLetter(arr[end])) {
				end--;
			} else {
				char tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
				start++;
				end--;
			}

		}
		return String.valueOf(arr);
	}
}