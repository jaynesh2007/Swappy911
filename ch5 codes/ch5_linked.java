import java.util.*;

public class ch5_linked
{
	public static void main(String args[])
	{
		LinkedList<String> cars = new LinkedList <String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Nissan");
		System.out.println(cars);
	//	Iterator itr=list.iterator();
		Iterator itr=cars.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		System.out.println("We are chancing name of variable");
		for(String list:cars)
		{
			System.out.println(list);
		}
	}
}