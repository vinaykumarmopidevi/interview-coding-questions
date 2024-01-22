package sample;

public class ReverseFirstLastChar {
	// Input
	// This game is not going anywhere
	// Output
	// shit eamg si ton going enywhera

	public static void main(String[] args) {
		String input = "This game is not going anywhere";
		method1(input.split(" "));
		
		
	}
	public static void method1(String[] args) {
		
		
		for (String value : args) {
			int len = value.length();
			String first=value.substring(0,1);
			String middle=value.substring(1, len-1);
			String last=value.substring(len-1, len);
			
			System.out.print(last + "" + middle + "" + first + " ");

		}

	}
	
}
