package cse.manoj.one;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class GetKthToTheLastElement {

	public static void main(String[] args) {
		/*
		PriorityQueue<String> qStr = new PriorityQueue<String>(0, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}			
			public void testMethod(){
				
			}
		});
		// TODO Auto-generated method stub
		
		qStr.add("manoj");
		qStr.add("abc");
		qStr.add("xyz");
		*/
	//	System.out.println(qStr);
		
		List<String> list = new LinkedList<String>();
		list.add("manoj");
		list.add("sai");
		list.add("illendula");
		list.add("venkata");
		list.add("manu");
		list.add("kartik");
		list.add("shiva");
		
		System.out.println(list);
		
		int k = 3;
		System.out.println(getKthElementFromLast2(list, k));

	}

	private static String getKthElementFromLast(List<String> list, int k) {
		System.out.println(list.size());
		Iterator<String> iter = list.iterator();
		int count = 0;
		while(iter.hasNext()){
			count++;
			if(count == (list.size()-k)){}
				//return (String)list.element();
		}
		return null;
		
	}
	
	private static String getKthElementFromLast2(List<String> list , int k) {
		//System.out.println(list);
		int j = 0;
		for (int i = k; i < list.size(); i++) {
			j++;
		}
		return list.get(j);
		//return null;
		
	}

}
