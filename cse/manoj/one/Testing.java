package cse.manoj.one;

import cse.manoj.one.Testing.X;

//import cse.manoj.one.Testing.X;


public class Testing extends StackExample
{

	public static class X {
		static String str = "inside X";
		public void myMethod(){
			System.out.println("myMethod");
		}
	}

	class Y{
		public Y() {
			System.out.println("Y created");
		}
		public void yDisplay(){
			System.out.println("inside Y Display");
		}
	}

	static int count;

	public static void print(int s, String i){ 

		System.out.println("Third asdasd Method with both- "+ s + "--" + i);  
	}  


	public void print(String s, int i){  
		System.out.println(super.getClass().getCanonicalName());
		System.out.println("Third Method with both- "+ s + "--" + i);  
	}  


	

	abstract class C {

		int i = 10;
		public Ex getFoo(String s) {
			System.out.println("in C "+s);
			System.out.println(i);

			return new Ex();
		}

		abstract void temp();

	}

	

}

