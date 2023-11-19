package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 55, 12, 40, 57, 60);

		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				return t % 2 == 0;
			}
		};
		System.out.println("***************************");
		nums.stream().sorted().filter(p).map(n -> n * 2).forEach(System.out::println);
		System.out.println("***************************");
		nums.stream().sorted().filter(p).map(StreamAPIDemo::addNum).forEach(System.out::println);

	}

	public static int addNum(int num) {
		return num + 2;
	}

}
