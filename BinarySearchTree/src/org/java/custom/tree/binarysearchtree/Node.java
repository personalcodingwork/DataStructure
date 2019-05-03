package org.java.custom.tree.binarysearchtree;

public class Node<T> {
	private T data;
	private Node<T> leftSubTree;
	private Node<T> rightSubTree;
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeftSubTree() {
		return leftSubTree;
	}
	public void setLeftSubTree(Node<T> leftSubTree) {
		this.leftSubTree = leftSubTree;
	}
	public Node<T> getRightSubTree() {
		return rightSubTree;
	}
	public void setRightSubTree(Node<T> rightSubTree) {
		this.rightSubTree = rightSubTree;
	}
	
	public String toString() {
		return this.data.toString();
	};
	}