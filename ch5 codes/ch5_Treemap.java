import java.util.*;
 public class ch5_Treemap
 {
	public static void main(String args[])
	{
		TreeMap <Integer,String> number = new TreeMap<Integer,String>();
		number.put(1,"one");
		number.put(2,"two");
		number.put(3,"three");
		number.put(4,"four");
		System.out.println(number);
		//number.putIfAbsent("Six", 6);
		TreeMap <Integer,String> n = new TreeMap<Integer,String>();
		n.putAll(number);
		n.put(5,"five");
		System.out.println("We have created a new one treemap"+n);
		
	}
 }