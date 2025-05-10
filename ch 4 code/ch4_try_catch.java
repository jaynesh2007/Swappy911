public class ch4_try_catch
{
	public static void main(String args[])
	{
		try
		{
			int a = 20;
			int b = 20/0;
			
		}
			catch(Exception e)
			{
				System.out.println("We have caught the exception"+e);
			}
		   //System.out.println("We are using try and catch function"+b);
	}
}
