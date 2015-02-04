package cse.manoj.two;

public class MyLinkedList {

	// 1. add
	// 2. remove
	// 3. size

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

	private MyNode head;

	public MyLinkedList() {
		head = new MyNode(0);
	}

	public void add(int data){
		MyNode temp = new MyNode(data);
		MyNode current = head;

		while(current.next != null) {
			current = current.next;
		}

		current.next = temp;
		listSize++;
	}

	public boolean remove(int index){

		MyNode current = head;
		for (int i = 1; i < index; i++) {
			if(current.next == null)
				return false;
			current = current.next;
		}
		current.next = current.next.next;
		listSize--;
		return true;
		
		/*int count = 0;
		while(count < index){
			if(head.next == null) 
				return false;
			count++;		
			head = head.next;
		}
		head.next = head.next.next;		
		return true;*/
	}

	public int size(){

		return 0;
	}	

}
