package sample;

public class Palendram {

	public static void main(String[] args) {
		int number = 121;
		int reminder = 0;
		int value = 0;
		while (number > 0) {
			reminder = number % 10;
			value = value * 10 + reminder;
			number = number / 10;
		}
		System.out.println(value);
	}

}
