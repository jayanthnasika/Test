package cse.manoj.one;

import java.util.Collections;
import java.util.Stack;

public class SortingStackElements {

	public static void main(String[] args) {
		Stack<Integer> stackToSort = new Stack<Integer>();
		stackToSort.push(10);
		stackToSort.push(20);
		stackToSort.push(5);
		stackToSort.push(6);
		stackToSort.push(1);
		stackToSort.push(15);
		
		System.out.println(stackToSort);
		Stack<Integer> newStack = sort(stackToSort);
		System.out.println("-->"+stackToSort.size());
		Collections.sort(stackToSort);
		System.out.println("-->"+stackToSort);
		System.out.println(newStack);
		System.out.println(newStack.pop());
	}
	
	public static Stack<Integer> sort(Stack<Integer> stackToSort){
		Stack<Integer> st2 = new Stack<Integer>();
		
		while(!stackToSort.isEmpty()){
			int tmp = stackToSort.pop();
			while(!st2.isEmpty() && st2.peek()>tmp){
				stackToSort.push(st2.pop());
			}
			st2.push(tmp);
		}
		
		return st2;
	}
	
}


