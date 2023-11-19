class Parent {
	Parent() {
		System.out.println("parent");
	}

}

class Sub extends Parent {
	Sub() {
		System.out.println("Sub");
	}
}

public class Demo {

	public static void main(String[] args) {
		Parent s=new Sub();
	}

}
