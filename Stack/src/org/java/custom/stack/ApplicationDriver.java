package org.java.custom.stack;

public class ApplicationDriver {

	public static void main(String[] args) {
		Stack<Integer> integerStack = new Stack<Integer>();
		integerStack.push(10);
		integerStack.push(20);
		integerStack.push(30);
		integerStack.push(40);
		
		integerStack.iterator();
		integerStack.pop();
		System.out.println();
		integerStack.iterator();
		
	}

}
