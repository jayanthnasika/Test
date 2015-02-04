package cse.manoj.one;

public class InheritanceDemo {
	
	static class NewClass {
		public void display(){
			System.out.println("in static class display");
		}
	}

	public static void main(String[] args) {
		
		NewClass c = new NewClass();
		//InheritanceDemo.NewClass nc =  new NewClass();
		
		InheritanceDemo.NewClass nc = new NewClass();
		nc.display();
		
		// TODO Auto-generated method stub
		//A a = new A();
		A a1 = new B();
		//a.getValue();
		a1.getValue();

		
		
		B b = new B();
		b.getValue();
		
		String s = null;
		
		try{
			s = "Hello";
			throw new StackOverflowError();
		}catch(StackOverflowError e){
			System.exit(1);
			throw new StackOverflowError();
		}finally{
			System.out.println(s);
		}
		
		
	}

	protected void finalize(){
		
	}
	
}


class A {

	public A() {
		System.out.println("A constructor");
	}

	public void getValue(){
		System.out.println("in A");
	}

}


class B extends A {

	public B() {
		System.out.println("B constructor");
	}

	public void getValue() {
		// TODO Auto-generated method stub
		System.out.println("in B");
	}
}

class C {

}