package sample;

public class Palendram {

	public static void main(String[] args) {
		int number = 121;
		int reminder = 0;
		int value = 0;
		while (number > 0) {
			reminder = number % 10;//1 2 1
			value = value * 10 + reminder;// 1 12 121
			number = number / 10;//12 1
		}
		System.out.println(value);
	}

}
