package cse.manoj.one;

import java.util.ArrayList;
import java.util.List;

public class AddNumbersList {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		// 17 in list 1
		list1.add(7);
		list1.add(1);
		
		//89 in list 2
		list2.add(9);
		list2.add(8);
		
		int carry = 0;
		for (int i = 0, j = 0; i < list1.size(); i++,j++) {
			int temp = list1.get(i)+list2.get(i);
			
		}
		
	}
}
