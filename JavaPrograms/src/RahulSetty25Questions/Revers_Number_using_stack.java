package RahulSetty25Questions;

import java.util.ArrayDeque;
import java.util.Stack;

public class Revers_Number_using_stack {
	
	public static void concept() {  // it is very old and support only LIFO instead we can use ArrayDeque
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.get(0));
		

		
		
	}
	
	public static void conceptDeque() { // Supports LIFO & FIFO

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		
	

	}
	
	public static void conceptDequeFIFO() { // Supports LIFO & FIFO

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		stack.offer(10);
		stack.offer(20);
		stack.offer(30);
		
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack);
	}
	
	public static void reverseUsingStack() {
		
		String s = "Hello";
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			stack.push(ch);
		}
		
		System.out.println(stack);
		
		StringBuilder st = new StringBuilder();
		
		while(!stack.isEmpty()) {
			st.append(stack.pop());
		}
		
		System.out.println(st);
	}
	
	public static void reverseUsingDequeLIFO() {
		
		String s = "Hello";
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(char ch : s.toCharArray()) {
			stack.push(ch);
		}
		
		System.out.println(stack);
		
		StringBuilder st = new StringBuilder();
		
		while(!stack.isEmpty()) {
			st.append(stack.pop());
		}
		
		System.out.println(st);
		
		//-----OR ------ 
		
		//System.out.println(stack.toString()); // it will return [o, l, l, e, H]
		
	}

public static void reverseUsingDequeFIFO() {
		
		String s = "Hello";
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(char ch : s.toCharArray()) {
			stack.offer(ch);
		}
		
		System.out.println(stack);
		
		StringBuilder st = new StringBuilder();
		
		while(!stack.isEmpty()) {
			st.append(stack.pollLast());
		}
		
		System.out.println(st);
	}
	public static void main(String[] args) {
		
		reverseUsingStack();
		
		System.out.println();
		
		reverseUsingDequeLIFO();
		
		System.out.println();
		
		reverseUsingDequeFIFO();
		
		//conceptDequeFIFO();

	}

}
