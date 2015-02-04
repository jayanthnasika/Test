package cse.manoj.one;
class Example5{
	   static int i;
	   static String s;
	   public Example5() {
		// TODO Auto-generated constructor stub
		   s = "new value";
	}
	   static{
		    i = 10;
		    s = "static block value";
	   }
	   public static void main(String args[]) //Its a Static Method
	   {
		   System.out.println(s);
		   System.out.println(i);
		   
		   i = 200;
		   s = "main value";
		   
	       Example5 obj=new Example5();
	       //Non Static variables accessed using object obj
	       System.out.println("i:"+Example5.i);
	       System.out.println("s:" + s);
	       
	       
	       
	   }
	   
	   static{
		    i = 100;
		    s = "2nd static block value";
	   }
	}