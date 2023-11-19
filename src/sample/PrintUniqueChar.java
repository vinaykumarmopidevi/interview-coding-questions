package sample;

public class PrintUniqueChar {

	public static void main(String[] args) {
		String input = "Vinay Kumar";

		char[] inputArr = input.toCharArray();

		for (int i = 0; i < inputArr.length; i++) {
			int count = 0;
			for (int j = 0; j < inputArr.length; j++) {
				if (inputArr[i] == inputArr[j]) {
					count += 1;
				}

			}
			if (count == 1) {
				System.out.print(inputArr[i] + " ");
			}
		}

	}

}
