package sample;

class Test implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Test");
			
		}
	}

}

class Sample implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sample");
			
		}

	}
	
}

public class DemoThread {

	public static void main(String... args) throws InterruptedException {
		Test t = new Test();
		Sample s = new Sample();
		Thread t1=new Thread(t);
		Thread t2=new Thread(s);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		System.out.println("before"+t1.isAlive());
		System.out.println("before"+t2.isAlive());
		t1.join();
		t2.join();
		System.out.println("after"+t1.isAlive());
		System.out.println("after"+t2.isAlive());
	}

}
