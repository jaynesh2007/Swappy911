
class Animal
{
		void sound()
		{
			System.out.println("Animal make sound");
		}
}
class Dogs extends Animal
{
	void sound()
	{
		super.sound();
		System.out.println("Dog barks");
	}
}
public class ch3_SI
{
	public static void	 main(String args[])
	{
		Dogs d = new Dogs();
		d.sound();
	}
}