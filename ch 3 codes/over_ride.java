class Car
{
	void vehicle()
	{
		System.out.println("This is car class ");
	}
}
class Bike
{
	void vehicle()
	{
		System.out.println("This is bike class");
	}
}
public class over_ride
{
	public static void main(String args[])
	{
		Car c =new Car();
		Bike b = new Bike();
		c.vehicle();
		b.vehicle();
	}
}