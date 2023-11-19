package sample;

public class ReversStrWithoutAffectingAnySpecialCharAndNumbers {
	//Reversing string without affecting any special characters
		// input:Aj@y@23Gundet!
		// output:te@d@23nuGyA!
		public static void main(String[] args) {

			String str = "Aj@y@23Gundet!";

			System.out.println("Original String : " + str);

			str = new ReversStrWithoutAffectingAnySpecialCharAndNumbers().reverseString(str);

			System.out.println("Reversed String : " + str);
		}

		public String reverseString(String str) {

			char[] arr = str.toCharArray();

			int l = 0;
			int r = arr.length - 1;
			while (l < r) {
				if (!Character.isLetter(arr[l])) {
					l++;
				} else if (!Character.isLetter(arr[r])) {
					r--;
				} else {
					char tmp = arr[l];
					arr[l] = arr[r];
					arr[r] = tmp;
					l++;
					r--;
				}

			}
			return String.valueOf(arr);
		}
	}