interface Displayable
{
	void display();
}
interface Showable
{
	void show();
}
class Cars implements Displayable,Showable
{
	public void display()
	{
		System.out.println("We are displaying message from display method and interface from Displayable");
	}
	public void show()
	{
		System.out.println("We are showing message from show method and interface from Showable");
	}
}
public class mul_inter
{
	public static void main(String args[])
	{
		Cars obj = new Cars();
		obj.display();
		obj.show();
	}
}