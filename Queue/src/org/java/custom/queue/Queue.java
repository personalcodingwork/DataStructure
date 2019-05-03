package org.java.custom.queue;

public class Queue<T extends Comparable<T>> {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;
	public boolean isEmpty() {
		return this.firstNode == null;
	}
	
	public void enQueue(T data) {
		size++;
		Node<T> newNode = new Node<T>(data);
		if(isEmpty())
			lastNode = newNode;
		else
			lastNode.setNextNode(newNode);
		lastNode = newNode;
		if(isEmpty()) {
			this.firstNode= this.lastNode;
		}
	}
	
	public T deQueue() {
		if(isEmpty()) return null;
		
		size--;
		T data = firstNode.getData();
		Node<T> temp = lastNode;
		firstNode= firstNode.getNextNode();
		if(isEmpty()) {
			this.lastNode = null;
		}
		return data;
	}
	
	public int getSize() {
		return this.size;
	}
	public void traverse() {
		Node<T> temp = firstNode;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
	}
}
