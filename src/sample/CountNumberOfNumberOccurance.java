package sample;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfNumberOccurance {
	public static void main(String[] args) {
		int[] arr = { 20, 40, 60, 40, 80, 90, 20 };
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			set.add(arr[i] + " " + count);
		}

		for (String s : set) {
			System.out.println(s.toString());
		}
	}

}
