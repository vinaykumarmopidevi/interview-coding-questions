package java8features;

interface Actor {
	void hero();
	void villain();
	default void commedy() {
		System.out.println("commedy");
	}
}
class Series{
	public void commedy() {
		System.out.println("commedy dosa");
	}
}
class Movie extends Series implements  Actor{

	@Override
	public void hero() {
		System.out.println("hero");
		
	}

	@Override
	public void villain() {
		
		System.out.println("villain");
	}
	
}

public class DefaultInter {

	public static void main(String[] args) {
		Actor a=new Movie();
		a.commedy();

	}

}
