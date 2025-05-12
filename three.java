import java.util.Scanner;
public class three
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=s.nextInt();
		System.out.println("Enter the value of b:");
		b=s.nextInt();
		System.out.println("Enter the value of c:");
		c=s.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater than b & c " + a);
			}
			else
			{
				System.out.println("C is greater than a & b " + c);
			}
		}
			else
			{
				if(b>c)
				{
					System.out.println("B is greater than a & c " + b);
				}
				else
				{
					System.out.println("C is greater than a & b " + c);
				}
		
			}
		s.close();
	}
}
