package decoratorPattern;
//The Decorator Pattern attaches additional

//responsibilities to an object dynamically.
//Decorators provide a flexible alternative to
//subclassing for extending functionality.

interface Color {
	void fill();
}

//concrete component of the base interface
class Black implements Color {
	@Override
	public void fill() {
		System.out.println("Black color");
	}
}

//abstract decorator class
abstract class ColorDecorator implements Color {

	// base class object
	protected Color colored;

	// constructor with base class object as the parameter
	public ColorDecorator(Color colored) {
		this.colored = colored;
	}

	public void fill() {
		colored.fill();
	}
}

//concrete decorator class extending base decorator class
class PatternDecorator extends ColorDecorator {
	public PatternDecorator(Color colored) {
		super(colored);
	}

	public void fill() {
		colored.fill();
		addPattern(colored);
	}

	private void addPattern(Color colored) {
		System.out.println("Pattern");
	}
}

public class DecoratorPattern {
	public static void main(String[] args) {

		Color black = new Black();
		Color pattern = new PatternDecorator(new Black());

		System.out.println("\nStyle: Solid");
		black.fill();

		System.out.println("\nStyle: Pattern");
		pattern.fill();
	}
}
