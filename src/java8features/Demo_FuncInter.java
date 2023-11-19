package java8features;

@FunctionalInterface
interface IShow {
	void display(String name);
	
}

public class Demo_FuncInter {

	public static void main(String[] args) {
		IShow show = (String name) -> {//lambda expression 
			System.out.println("Good Morning , " + name);
			System.out.println("How are you? , " + name);
		};
		show.display("Vinay");
	}
	
	
	
	
	

}
