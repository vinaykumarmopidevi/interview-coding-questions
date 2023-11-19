package sample;

abstract class A {
	A() {
		System.out.println("A Class");
	}
}

class B extends A {
	 B() {
		System.out.println("B Class");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		B b = new B();
	}

}
