package sample;

public class ReverseString {

	public static void main(String[] args) {
		String str="looking";
		System.out.println("Before reverse "+str);
		str=reverseString(str);
		System.out.println("After reverse "+str);

	}

	private static String reverseString(String str) {
		char[] charArr=str.toCharArray();
		int start=0;
		int end=charArr.length-1;
			
		while(start<end) {
			char temp =charArr[start];
			charArr[start]=charArr[end];
			charArr[end]=temp;
			start++;
			end--;
		}
		
		
		
		return new String(charArr);
	}
	

}
