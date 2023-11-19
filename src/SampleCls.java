

public class SampleCls {

	public static void main(String... args) {
		String str = "hgshad 7800ewr dsnb78fjdh jdhfj88dhjdfh jhjss992m";
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				str = str.replace(str.charAt(i), ' ');
			}
		}
		String[] strArr = str.trim().split("\\s+");
		for (String strVal : strArr) {
			int value = Integer.parseInt(strVal);
			if (value != 0) {
				int reminder = 0, sum = 0;
				while (value > 0) {
					reminder = value % 10;
					sum += reminder;
					value /= 10;
				}
				System.out.println("Sum of "+strVal+" = "+sum);
			}
		}

	}
}
