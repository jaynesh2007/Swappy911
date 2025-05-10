// Parent class
class A {
    int a = 10;
    int b = 20;

    void initialize() {
        System.out.println("We are printing a and b values: " + a + ", " + b);
    }
}

// First child class inheriting from A
class B extends A {
    void sum() 
	{
        int result = a + b;
        System.out.println("Sum of a and b: " + result);
    }
}

// Second child class inheriting from A
class C extends A {
    void multiply() {
        int result = a * b;
        System.out.println("Multiplication of a and b: " + result);
    }
}

// Main class
public class HierarchicalExample {
    public static void main(String[] args) {
        // Object of Parent Class
        
		A objA = new A();
        objA.initialize(); // Calling parent class method

        // Object of Child Class B
        B objB = new B();
        objB.initialize(); // Inherited from A
        objB.sum();        // Specific to B

        // Object of Child Class C
        C objC = new C();
        objC.initialize(); // Inherited from A
        objC.multiply();   // Specific to C
    }
}
