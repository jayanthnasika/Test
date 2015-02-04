package cse.manoj.two;

public class MyDoubleLinkedList {

	MyNode2 head = null;
	int listSize = 0;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("");
		sb.append("[");
		while(head != null){
			sb.append(head.data).append(" ");
			head = head.next;
		}
		sb.append("]");
		return sb.toString().trim();

	};
	
	public MyDoubleLinkedList() {
		head = new MyNode2();
	}

	public void addAt(int index, Object data){
		MyNode2 newNode = new MyNode2(data);
		MyNode2 current = head;
		for (int i = 0; i < index ; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;		
		newNode.previous = current;
		newNode.next.previous = newNode;
		listSize++;
	}	
	
	public void add(Object data){
		MyNode2 newNode = new MyNode2(data);
		MyNode2 current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		newNode.previous = current;
		listSize++;
	}
	
	public void remove(int index){
		MyNode2 current = head;
		for (int i = 0; i < index-1; i++) {
			current = current.next;
		}
		current.next = current.next.next;
		current.next.next.previous = current;
		listSize--;
	}
	
	
}
