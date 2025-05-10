class IA extends Exception
{
	IA (String message)
	{
		super (message);
	}
	
}
class test 
{
	int age;
	void check_age(int age)throws IA
	{
		if(age<18)
		{
			throw new IA("Your are small for voting :"+age);
		}
		else
		{
			System.out.println("Yours are able to vote:"+age);
		}
	}
}
public class ch4_user_defineTH
{
	public static void main(String args[]) throws IA
	{
		try
		{
			
			test obj = new test();
			obj.check_age(17);
		}
		catch(IA e)
		{
			System.out.println("Exception caught: " + e.getMessage());
		}
		
		test obj1 = new test();
		try
		{
			obj1.check_age(20);
		}
		catch(IA e)
		{
			  System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
		