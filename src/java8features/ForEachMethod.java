package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 23, 30, 40, 57, 60);

		nums.forEach(t -> System.out.println("values " + t));

//		nums.forEach((t) ->
//		{
//			if (t == 40) {
//				System.out.println(t);
//			}
//
//		}
//
//		);

	
	}
}
