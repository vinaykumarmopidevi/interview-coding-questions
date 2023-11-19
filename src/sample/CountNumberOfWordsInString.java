package sample;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {

		countNumberOfWords("I Love Java Programming");

	}

	private static void countNumberOfWords(String line) {
		int count = line.isEmpty() ? 0 : line.split("\\s+").length;

		System.out.println(count);
	}

}