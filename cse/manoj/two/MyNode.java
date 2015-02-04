package cse.manoj.two;

public class MyNode {

	MyNode next;
	int data;
	
	public MyNode() {
		// TODO Auto-generated constructor stub
	}
	
	public MyNode(int data) {
		this.next = null;
		this.data = data;
	}	
}
	
	/*public void add(MyNode head){
		MyNode root = this;
		while(root != null) {
			root = root.next;
		}
		root.next = head;
	}*/
	
	/*@Override
	public String toString(){
		MyNode node = this;
		StringBuffer sb = new StringBuffer("");
		sb.append("[");
		while(node != null){
			sb.append(node.data);
			node = node.next;
		}
		sb.append("]");
		return sb.toString();
	}*/
	

