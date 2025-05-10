public class Student 
{

    int id;
    String name;

    // 1. Referring to instance variable using this
    Student(int id, String name) 
	{
        this.id = id;        // Refers to instance variable
        this.name = name;
        this.display();      // 2. Calling current class method
    }

    // 2. Method to be called using this
    void display() 
	{
        System.out.println("Student: " + id + ", " + name);
    }

    // 3. Constructor chaining using this()
    Student() 
	{
        this(101, "Jaynesh");  // Calls parameterized constructor
    }

    // 4. Passing current object as argument
    void sendToPrinter() 
	{
        Printer p = new Printer();
        p.print(this);  // Pass current object
    }

    // 5. Returning current object
    Student getStudent() 
	{
        return this;
    }

    public static void main(String[] args) 
	{
        Student s = new Student();  // Calls default constructor
        s.sendToPrinter();

        Student s2 = s.getStudent();  // Returning current object
        System.out.println("Returned object name: " + s2.name);
    }
}

// Printer class should come after Student (or as a nested class)
class Printer 
{
    void print(Student s) 
	{
        System.out.println("Printer received object: " + s.name);
    }
}