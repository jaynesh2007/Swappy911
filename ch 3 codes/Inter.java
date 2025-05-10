interface Printable
{
	void print();
}
class A implements Printable
{
	 public void print()
	{
		System.out.println("We are printing message form interface method");
	}
}
public class Inter
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.print();
	}
}