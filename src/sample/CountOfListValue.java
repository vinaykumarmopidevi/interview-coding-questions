package sample;

import java.util.HashSet;
import java.util.Set;

public class CountOfListValue {
	static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {
		//Integer repeating
//		int[] arr = { 10, 30, 40, 50, 10, 30, 20, 40, 40, 60 };
//		Set<String> set=new HashSet<String>();
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count+=1;
//				}
//			}
//			set.add(arr[i]+" : "+count);
//		}
//		System.out.println("Inte values repeating only one time :");
//		for (String s : set) {
//			System.out.println(s);
//		}
		//String repeating
				String str="String repeating";
				char[] charArr= str.toCharArray();
				Set<String> setStr=new HashSet<String>();
				for(int i=0;i<charArr.length;i++) {
					int count=0;
					for(int j=0;j<charArr.length;j++) {
						if(charArr[i]==charArr[j]) {
							count+=1;
						}
					}
					setStr.add(charArr[i]+" : "+count);
				}
				System.out.println("Char values repeating only one time :");
				for (String s : setStr) {
					System.out.println(s);
				}
	}

}
