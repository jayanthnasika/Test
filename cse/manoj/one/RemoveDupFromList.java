package cse.manoj.one;

import java.util.Hashtable;

public class RemoveDupFromList {

	public static void main(String[] args) {
		
		
	}

	public void deleteDups(LinkedListNode n){
		
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		while(n != null){
			if(table.containsKey(n.data)){
				previous.next = n.next;				
			}
		}
		
	}
	
}


class LinkedListNode {
	
	LinkedListNode next = null;
	int data;
	
	public LinkedListNode(int d) {
		data = d;
	}
	
	public void appendToTail(int d) {
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode node = this;
		while(node.next!=null){
			node = node.next;
		}
		node.next = end;		
	}
	
}