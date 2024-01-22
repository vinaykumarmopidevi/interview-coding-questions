package sample;

import java.util.Arrays;

public class StringsAnagrams {
	public static void main(String[] args) {
		boolean flag = m1();
		if (!flag) {
			System.out.println("two strings are not anagrams");
		} else {
			System.out.println("two strings are anagrams");
		}
	}

	public static boolean m1() {
		String s1 = "vinay";
		char[] charArr1 = s1.toCharArray();
		Arrays.sort(charArr1);
		System.out.println(String.valueOf(charArr1));
		
		String s2 = "ynvia";
		char[] charArr2 = s2.toCharArray();
		Arrays.sort(charArr2);
		System.out.println(String.valueOf(charArr2));
		
		
		return String.valueOf(charArr1).equals(String.valueOf(charArr2))? true: false;
	}
}
