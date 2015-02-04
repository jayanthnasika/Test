package cse.manoj.one;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> st = new StackV<Integer>();
		System.out.println(st);
		
		st.push(45);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.push(1);
		st.push(12);st.push(12);
		st.push(12);
		st.push(2);
		System.out.println(st);
		
	}
	
	
}

class StackV<E> extends Stack<E>{
	
	@Override 
	 public String toString() {
	        Iterator<E> it = iterator();
	        if (! it.hasNext())
	            return "{{}}";

	        StringBuilder sb = new StringBuilder();
	        sb.append('<');
	        for (;true;) {
	            E e = it.next();
	            sb.append(e == this ? "(this Collection)" : e);
	            if (! it.hasNext())
	                return sb.append('>').toString();
	            sb.append(',').append(' ');
	        }
	    }
	
}
