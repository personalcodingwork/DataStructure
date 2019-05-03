package org.java.custom.tree.binarysearchtree;

public interface Tree <T>{
	public void insert(T data);
	public Node<T> delete(T data);
	public void traverse();
	public T getMax();
	public T getMin();
}
