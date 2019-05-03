package org.java.custom.stack;

public class Stack<T extends Comparable<T>> {
	private Node<T> root;
	private int size;
	
	public void push(T data) {
		size++;
		if(this.root == null) {
			this.root = new Node<T>(data);
		}else {
			Node<T> newNode = new Node<T>(data);
			newNode.setNextNode(this.root);
			this.root = newNode;
		}
	}
	
	public T pop() {
		if(root == null) return null;
		size--;
		T data = root.getData();
		this.root = root.getNextNode();
		return data;
	}
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void iterator() {
		Node<T> temp = this.root;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
	}
}
