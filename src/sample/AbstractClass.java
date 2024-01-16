package sample;

abstract class First {
	First() {
		System.out.println("First Constructor");
	}
}

class Second extends First {
	Second() {
		System.out.println("Second Constructor");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Second b = new Second();
	}

}
/*
 * Output
 * First  Constructor 
 * Second Constructor
 */
