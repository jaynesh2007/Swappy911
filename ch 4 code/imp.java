class A implements Runnable
{
	 public void run()
	{
		System.out.println("We are running thread by implement");
	}
}
public class imp
{
	public static void main(String args[])
	{
		A obj =new A();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}