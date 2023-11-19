package sample;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 10;
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2 + " ");
		while (number > 0) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			number--;
		}
	}

}
