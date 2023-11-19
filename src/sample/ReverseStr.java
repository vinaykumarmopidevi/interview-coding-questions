package sample;

public class ReverseStr {

	public static void main(String[] args) {
		String str = "capable of firing several shots in succession without reloading";

		for (String value : str.split(" ")) {
			String val = "";
			for (int i = value.length() - 1; i >= 0; i--) {
				val += value.charAt(i);
			}
			System.out.print(val);
			System.out.print(" ");
		}

		String input = "Vinaya Kumar Mopidi";
		// output : mopidi kumar vinaya

		String[] strArr = input.split(" ");
		for (int i = strArr.length - 1; i >= 0; i--) {
			String first = strArr[i].substring(0, 1).toLowerCase();
			String remain = strArr[i].substring(1);

			System.out.print(first + "" + remain + " ");
		}

	}

}
