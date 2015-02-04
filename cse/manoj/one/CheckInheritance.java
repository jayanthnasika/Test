package cse.manoj.one;

public class CheckInheritance {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.getA());
		System.out.println(p.getB());
		
		Child c = new Child();
		System.out.println(c.getA());
		System.out.println(c.getB());
	}
}

class Parent {

	private int a = 10;
	protected int getA(){
		return a;
	}
	
}

class Child extends Parent{
	private int a = 20;
	public int getA(){
		return a;
	}
	public int getB(){
		return a+30;
	}
}