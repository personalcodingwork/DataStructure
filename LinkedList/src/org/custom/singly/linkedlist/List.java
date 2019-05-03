package org.custom.singly.linkedlist;

public interface List<T extends Comparable<T>> {
	public void insert(T data);
	public boolean remove(T data);
	public void traverseList();
	public int size();
}
