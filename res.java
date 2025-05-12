import java.util.Scanner;
public class res
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int reverse =0;
		System.out.println("Enter the number for reversing");
		int num = s.nextInt();
		 while(num !=0)
		 {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num= num/10;
		}
		System.out.println("Reversed number: " +reverse);
		s.close();
	}
}