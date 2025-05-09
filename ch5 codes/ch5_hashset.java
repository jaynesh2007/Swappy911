import java.util.*;
 public class ch5_hashset
 {
	public static void main(String args[])
	{
		HashSet<Integer> number = new HashSet<Integer>();
		number.add(2);
		number.add(4);
		number.add(6);
		System.out.println(number);
		HashSet<Integer> n = new HashSet<Integer>();
		n.addAll(number);
		n.add(9);
		System.out.println("We are printing new variable of hash set"+n);
	}
}