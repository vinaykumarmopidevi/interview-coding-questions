package sample;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 3 };

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entery : frequencyMap.entrySet()) {
			if (entery.getValue() > 1) {
				System.out.println(entery.getKey() + " " + entery.getValue());
			}

		}
	}

}
