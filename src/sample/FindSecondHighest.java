package sample;

import java.util.ArrayList;
import java.util.List;

public class FindSecondHighest {

	public static void main(String[] args) {
		int[] arr= {20,36,-6,25,78,52,10,2};
//		List<Integer> list=new ArrayList<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			int tmp=0;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] < arr[j]) {
//					tmp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}
//			list.add(arr[i]);
//		}
//		for(int i:arr) {
//			System.out.println(i);
//		}
//		System.out.println(" Second Highest "+list.get(1));
		System.out.println(findSecondHighest(arr));
	}
	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

}
