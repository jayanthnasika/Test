package cse.manoj.one;

import java.util.HashMap;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("CSE562");
		String s2 = new String("CSE562");
		
		String ss1 = "CSE562";
		String ss2 = "CSE562";
		
		if(s1 == s2)
			System.out.println("a");
		else
			System.out.println("b");
		
		if(ss1 == ss2)
			System.out.println("aa");
		else
			System.out.println("bb");
		
		int count = 0;
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		foo(hs,count);
		System.out.println("-->" + hs.size());
		System.out.println("-->" + count);
	}

	private static void foo(HashMap<Integer, String> hs2, int count1) {
		// TODO Auto-generated method stub
		hs2.put(1, "temp");
		hs2.put(2, "asda");
		count1++;
		count1++;
	}
}
