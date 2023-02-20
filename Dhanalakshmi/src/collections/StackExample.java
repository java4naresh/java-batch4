package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(6);
		stack.push(10);
		stack.push(26);
		stack.push(19);
		stack.push(4);
		stack.push(24);
		stack.add(22);
		//System.out.println(stack);
		//System.out.println(stack.peek());
		//System.out.println(stack.peek());
		//System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.get(4));// 


	}

}
