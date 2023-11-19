package sample;

public class CharNextCount {

	public static void main(String[] args) {
		String str = "aabbbcdddccaaa";
		int len = str.length();
		int count = 1;
		char first = 0, next = 0;
		for (int i = 0; i < len - 1; i++) {
			first = str.charAt(i);
			next = str.charAt(i + 1);
			if (first == next) {
				count += 1;
			} else {
				System.out.print(first + "" + count);
				count = 1;
			}
			
		}
		System.out.print(first + "" + count);
	}

}
