import java.util.*;
 public class ch5_hashmap
 {
	public static void main(String args[])
	{
		HashMap <String,Integer> lan = new HashMap<String,Integer>();
		lan.put("Java",1);
		lan.put("C",2);
		lan.put("CS",3);
		lan.put("Python",4);
		System.out.println(lan);
		System.out.println(lan.values());
		System.out.println(lan.keySet());
		lan.replace("CS",5);
		System.out.println(lan);
		lan.remove("CS");
		System.out.println(lan);

	}
}
		