package sample;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="aba";
		
		
		char[] chars=str.toCharArray();
		
		int start=0;
		int end=chars.length-1;
		
		while(start<end) {
			
			char temp=chars[start];
			chars[start]=chars[end];
			chars[end]=temp;
			
			start++;
			end--;
		}
		
		if(str.equals(String.valueOf(chars))) {
			System.out.println("it is palindrom "+str);
		}else {
			System.out.println("it is not a palindrom "+str);
		}
	}

}
