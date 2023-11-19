package sample;

public class StringSumOfDigits {

	public static void main(String[] args) {
		String str = "test665 ehhh738fhj jhfkj443   897jhkfj";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isDigit(c)) {
				str = str.replace(String.valueOf(c), " ");
			}
		}
		String[] sp = str.split(" ");

		for (String s : sp) {
			if (!s.isEmpty()) {
				sumOfDigit(Integer.parseInt(s));
			}
		}

	}

	public static void sumOfDigit(int number) {
		System.out.print(number+" sum is : ");
		int reminder = 0;
		int value = 0;
		while (number > 0) {
			reminder = number % 10;
			value = value + reminder;
			number = number / 10;
		}
		System.out.println(value);
	}
}
