package sample;

public class ReverseFirstLastChar {
	// Input
	// This game is not going anywhere
	// Output
	// shit eamg si ton going enywhera

	public static void main(String[] args) {
		String input = "This game is not going anywhere";
		String[] inputArr = input.split(" ");
		for (String value : inputArr) {
			int len = value.length();
			String first = value.substring(0, 1);
			String middle = value.substring(1, len - 1);
			String last = value.substring(len - 1, len);
			System.out.print(last + "" + middle + "" + first + " ");

		}

	}
}
