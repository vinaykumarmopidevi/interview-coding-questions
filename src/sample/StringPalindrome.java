package sample;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="aba";
		String value="";
		
		for(int i=str.length()-1;i>=0;i--) {
			value+=str.charAt(i);
		}
		if(str.equals(value)) {
			System.out.println("it is palindrom "+str);
		}else {
			System.out.println("it is not a palindrom "+str);
		}
	}

}
