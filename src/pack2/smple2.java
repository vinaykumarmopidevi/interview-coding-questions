package pack2;

public class smple2 {
	
	private void m1(double d) {
		System.out.println("i am double"+d);

	}
	private void m1(int d) {
		System.out.println("i am int "+d);

	}
	public static void main(String[] args) {
		smple2 s=new smple2();
		s.m1(45.9);
		s.m1(45);
	}

}
