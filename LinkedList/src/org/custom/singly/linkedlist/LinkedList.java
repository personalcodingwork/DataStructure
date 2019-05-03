package org.custom.singly.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T>{
	private Node<T> root;
	private int listSize;
	
	@Override
	public void insert(T data) {
		this.listSize++;
		if(root == null) {
			this.root = new Node<T>(data);
		}else {
			insertAtBegining(data);
		}
	}
	
	private void insertAtBegining(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}
	
	public void insertAtEnd(T data, Node<T> node) {
		listSize++;
		Node<T> newNode = new Node<T>(data);
		if(node.getNextNode()!=null)
		  insertAtEnd(data, node.getNextNode());
		else {
			node.setNextNode(newNode);
		}
	}
	
	@Override
	public boolean remove(T data) {
		//If no element
		if(this.root == null)
			return false;
		//If element found at first node
		if(data.compareTo(this.root.getData())==0) {
			this.root = this.root.getNextNode();
			listSize--;
			return true;
		}else 
			return remove(data, this.root, this.root.getNextNode()); // If element found in nth position
			
	}
	private boolean remove(T dataToBeRemove, Node<T> previousNode, Node<T> currentNode) {
		while(currentNode != null) {
			if(currentNode.getData().compareTo(dataToBeRemove) == 0) {
				previousNode.setNextNode(currentNode.getNextNode());
				currentNode = null;
				listSize--;
				return true;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		return false;	
	}

	@Override
	public void traverseList() {
		if(this.root == null) return;
		Node<T> temp = this.root;
		System.out.print("[");
		while(temp != null) {
			System.out.print(" "+temp.getData());
			temp = temp.getNextNode();
		}
		System.out.print("]");
		System.out.println();
	}
	@Override
	public int size() {
		return listSize;
	}
}
