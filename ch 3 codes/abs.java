abstract class A
{
	abstract void print();
}
class Cars extends A
{
	public void print()
	{
		System.out.println("We are printing message from abstract method and extended abstract class");
	}
}
public  class abs
{
	public static void main (String args[])
	{
		Cars c = new Cars();
		c.print();
	}
}