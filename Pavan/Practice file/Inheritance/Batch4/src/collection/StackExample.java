package collection;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(6);
		stack.push(19);
		stack.push(5);
		stack.push(7);
		stack.add(4);
		stack.add(17);
		stack.add(20);
		// System.out.println(stack);
		// System.out.println(stack.peek());
		// System.out.println(stack.peek());
		// System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.get(4));// Exception
	}

}
