package sample;

public class TitleUpperCase {

	public static void main(String[] args) {
		String str="learn java programming";
		String[] strArr=str.split(" ");
		String finalStr="";
		for(String value:strArr) {
			value=value.substring(0, 1).toUpperCase().concat(value.substring(1));
			finalStr=finalStr.concat(value+" ");
		}
		System.out.println(finalStr);
	}

}
