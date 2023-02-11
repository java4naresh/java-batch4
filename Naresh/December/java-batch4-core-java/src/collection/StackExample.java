package collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(8);
		stack.push(9);
		stack.push(1);
		stack.push(3);
		stack.add(6);
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
		System.out.println(stack.get(4));//Exception
	}

}
