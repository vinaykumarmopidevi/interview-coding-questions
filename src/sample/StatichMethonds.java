package sample;
/*
 * In Java, 
static methods cannot be overridden in the same way that instance methods can be. 
When a subclass declares a static method with the same signature as a static method in its superclass, 
it is actually hiding the superclass method rather than overriding it.
This concept is known as method hiding. 
In method hiding, the subclass provides a new implementation of the static method, 
but it does not override the method in the superclass.
Instead, the static method in the subclass simply hides the static method in the superclass.
Here's an example to illustrate method hiding with static methods in Java:
*/
class Superclass {
    static void staticMethod() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Superclass {
    static void staticMethod() {
        System.out.println("Static method in Subclass");
    }
}

public class StatichMethonds {
    public static void main(String[] args) {
        Superclass.staticMethod(); // Calls the static method in Superclass
        Subclass.staticMethod();    // Calls the static method in Subclass
    }
}

