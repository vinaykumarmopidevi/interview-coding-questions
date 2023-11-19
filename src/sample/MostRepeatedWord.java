package sample;

import java.util.Arrays;

public class MostRepeatedWord {

	public static void main(String[] args) {
		String str = "how can I find the most frequent word in an string how can I find how how how string";
		String[] strArr = str.split(" ");
		Arrays.sort(strArr);
		int MAX = 0;
		int count = 1;
		String word = strArr[0];
		String curr = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i].equals(curr)) {
				count++;
			} else {
				count = 1;
				curr = strArr[i];
			}
			if (MAX < count) {
				MAX = count;
				word = strArr[i];
			}

		}
		System.out.println(word + " X " + MAX);
	}

}
