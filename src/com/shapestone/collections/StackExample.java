package com.shapestone.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
	stack.push(1);//push is used to add the elements in stack
	stack.push(2);
	stack.push(3);
	stack.pop();//it is used to remove the element in a stack
	System.out.println(stack);
	System.out.println(stack.peek());//it returns top most element in a stack.
	System.out.println(stack.isEmpty());//it is used to check wheather stack is empty or not.
	System.out.println(stack.search(1));//it returns offset values if element is present other wise return -1;
	}

}
