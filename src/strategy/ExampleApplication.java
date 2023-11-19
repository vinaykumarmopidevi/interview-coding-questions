package strategy;

//The Strategy Pattern defines a family of algorithms,
//encapsulates each one, and makes them interchangeable.
//Strategy lets the algorithm vary independently from
//clients that use it.

interface IStrategy {
	int execute(int a, int b);
}

class ConcreteStrategyAdd implements IStrategy {
	@Override
	public int execute(int a, int b) {
		return a + b;
	}

}

class ConcreteStrategySub implements IStrategy {

	@Override
	public int execute(int a, int b) {
		return a - b;
	}

}

class ConcreteStrategyMul implements IStrategy {

	@Override
	public int execute(int a, int b) {
		return a * b;
	}

}

class Context {
	private IStrategy strategy;

	Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int applyCalculator(int a,int b) {
		return strategy.execute(a, b);
    }
}

public class ExampleApplication {

	public static void main(String[] args) {
		Context s=new Context(new ConcreteStrategyAdd());
		int value=s.applyCalculator(10, 30);
		System.out.println(value);
		
	}

}
