package sample;

import java.util.ArrayList;
import java.util.List;



public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList() {
			{
				add(20);
				add(34);
				add(67);
				add(86);
			}
		};
		
		list.forEach((n) -> System.out.println(n));
		
	}

	

}
