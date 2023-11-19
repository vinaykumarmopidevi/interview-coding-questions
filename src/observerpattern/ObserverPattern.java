package observerpattern;

import java.util.ArrayList;
import java.util.List;

//The Observer Pattern defines a one-to-many relationship between a set of objects.
//When the state of one object changes, all of its dependents are notified.

class Message {
	private String message;

	Message(String message) {
		this.message = message;
	}

	String getMessage() {
		return this.message;
	}
}

interface Subject {
	public void attach(Observer observer);

	public void detach(Observer observer);

	public void notify(Message message);
}

interface Observer {
	public void update(Message message);
}

class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notify(Message message) {
		for (Observer observer : observers) {
			observer.update(message);
		}

	}
}

class ObserverA implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("observerA: " + message.getMessage());

	}

}

class ObserverB implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("observerB: " + message.getMessage());

	}

}

class ObserverC implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("observerC: " + message.getMessage());

	}

}

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObserverA a = new ObserverA();
		ObserverB b = new ObserverB();
		ObserverC c = new ObserverC();

		ConcreteSubject publisher = new ConcreteSubject();
		publisher.attach(a);
		publisher.attach(b);

		publisher.notify(new Message("First update\n"));

		publisher.attach(c);
		publisher.detach(b);
		publisher.notify(new Message("Second update\n"));

	}

}
