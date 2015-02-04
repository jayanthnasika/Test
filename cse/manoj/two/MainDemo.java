package cse.manoj.two;



public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDoubleLinkedList dll = new MyDoubleLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		
		//dll.addAt(0, 25);
		
		dll.remove(6);
		System.out.println(dll);
		
		
		/*MyLinkedList lis = new MyLinkedList();
		lis.add(20);
		lis.add(30);
		lis.add(40);
		
		
		lis.remove(3);
		
	//	lis.add(50);
		System.out.println(lis.listSize);*/
	}

}
