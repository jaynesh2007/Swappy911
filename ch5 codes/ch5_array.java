import java.util.*;

public class ch5_array
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("G Wagon");
		System.out.println(list);
		for(String car:list)
		{
				System.out.println(car);
		}
		list.set(1,"porsche");
		for( String c:list)
		{
			System.out.println("We are changing element of index 1"+c);
		}
		//Iterator itr=list.iterator();
		//while(itr.hasNext())
		//{
		//	System.out.println(itr.next());
		//}	
	}
}
		