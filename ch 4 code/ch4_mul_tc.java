public class ch4_mul_tc
{
	public static void main(String args[])
	{
		try
		{
			int[] c = {1,2,3,4,5};
			System.out.println(c[10]);
			int result = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException ep)
		{
			System.out.println("We are acessing out of bound it will catch error"+ep.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("We are catching Arithmetic Exception "+e.getMessage());
		}
	}
}
			