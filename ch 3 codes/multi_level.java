class A
{
	void display()
	{
		System.out.println("We are display from class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("We are  showing from class B");
	}
}
class C extends B
{
	void print()
	{
		System.out.println("We are printing C");
	}
}
public class multi_level
{
	public static void main(String args[])
	{
		A objA = new A();
		B objB = new B();
		C objC =  new C();
		objA.display();
		objB.show();
		objC.print();
	}
}