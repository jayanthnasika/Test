package cse.manoj.two;

public class MyNode2 {

	MyNode2 previous;
	MyNode2 next;
	Object data;
	
	public MyNode2() {
		
	}
	
	public MyNode2(Object data){
		this.next = null;
		this.data = data;
	}
	
}
