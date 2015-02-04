package cse.manoj.one;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	int capacity = 0;
	
	public SetOfStacks(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(int value){
		Stack<Integer> lastStack = getLastStack();
		if(lastStack!=null && !lastStack.isEmpty()){
			lastStack.push(value);
		}
		else {
			Stack<Integer> newStack = new Stack<Integer>();
			newStack.push(value);
			stacks.add(newStack);			
		}
	}
	
	private Stack<Integer> getLastStack() {
		// TODO Auto-generated method stub
		if(stacks==null || stacks.size()==0) return null;
		return stacks.get(stacks.size()-1);
	}

	public int pop(){
		Stack<Integer> lastStack = getLastStack();
		int retVal = lastStack.pop();
		if(lastStack == null || lastStack.size()==0) stacks.remove(stacks.size()-1);
		return retVal;
	}
	
	
}
