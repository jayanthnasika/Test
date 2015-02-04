package cse.manoj.one;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		System.out.println(table.put("one", 1));
		System.out.println(table.put("two", 2));
		System.out.println(table.put("three", 3));
		System.out.println(table.put("five", 5));
		
		int x = table.get("three");
		System.out.println(table);
		System.out.println(x);

	}

}
