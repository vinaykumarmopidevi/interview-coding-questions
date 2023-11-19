package sample;

class Parent2 {
    // Can't be overridden
    final void show() {}
}
 
class Child2 extends Parent2 {
    // Cannot override the final method from Parent2
   // void show() {}
}

class Parent1 {
	// private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class Child1 extends Parent1 {
	// new m1() method
	// unique to Child class
	private void m1() {
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		System.out.println("From child m2()");
	}
}

public class StaticMethodOverride2 {

	public static void main(String[] args) {

        Parent1 obj1 = new Parent1();
        obj1.m2();
        Parent1 obj2 = new Child1();
        obj2.m2();
	}

}
