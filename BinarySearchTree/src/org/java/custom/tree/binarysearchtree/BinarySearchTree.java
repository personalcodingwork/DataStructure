package org.java.custom.tree.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	private Node<T> root;

	@Override
	public void insert(T data) {
		if(this.root == null) {
			this.root = new Node<T>(data);
		}else {
			insert(data, this.root);
		}
	}

	private void insert(T data, Node<T> node) {
		if(data.compareTo(node.getData()) < 0 ) {
			if(node.getLeftSubTree() != null) {
				insert(data, node.getLeftSubTree());
			}else {
				Node<T> newNode = new Node<T>(data);
				node.setLeftSubTree(newNode);
			}
		}else {
			if(node.getRightSubTree() != null) {
				insert(data, node.getRightSubTree());
			}else {
				Node<T> newNode = new Node<T>(data);
				node.setRightSubTree(newNode);
			}
		}
	}

	@Override
	public Node<T> delete(T data) {
		if(this.root == null) return null;
		 Node<T> node = delete(data, this.root);
		return node;
	}

	private Node<T> delete(T data, Node<T> node) {
		if(data.compareTo(node.getData())<0) {
			node.setLeftSubTree(delete(data, node.getLeftSubTree()));
		}else if(data.compareTo(node.getData()) > 0) {
			node.setRightSubTree(delete(data, node.getRightSubTree()));
		}else {
			if(node.getLeftSubTree() == null && node.getRightSubTree() == null) {
				System.out.println("Removing the leafe node");
				return null;
			}else if(node.getLeftSubTree() == null) {
				System.out.println("Removing the rigth chield");
				Node<T> newNode = node.getRightSubTree();
				node = null;
				return newNode;
			}else if(node.getRightSubTree() == null) {
				System.out.println("Removing the left chield");
				Node<T> newNode = node.getLeftSubTree();
				node = null;
				return newNode;
			}
			//Two children case
			System.out.println("Two children case");
			Node<T> newNode = getPredecessor(node.getLeftSubTree());
			System.out.println(newNode);
			node.setData(newNode.getData());
			node.setLeftSubTree(delete(newNode.getData(), node.getLeftSubTree()));
		}
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightSubTree()!=null) {
			return getPredecessor(node.getRightSubTree());
		}
		return node;
	}

	@Override
	public void traverse() {
		if(this.root!=null)
			traverse(this.root);
		System.out.println();
	}

	private void traverse(Node<T> node) {
		if(node.getLeftSubTree()!=null)
			traverse(node.getLeftSubTree());
		System.out.print("->"+node.getData());
		if(node.getRightSubTree()!=null)
			traverse(node.getRightSubTree());
	}

	@Override
	public T getMax() {
		if(this.root == null) return null;
		return getMax(this.root);
		
	}

	private T getMax(Node<T> node) {
		if(node.getRightSubTree()!=null) {
			return getMax(node.getRightSubTree());
		}
		return node.getData();
		
	}

	@Override
	public T getMin() {
		if(this.root == null) return null;
		return getMin(this.root);
	}

	private T getMin(Node<T> node) {
		if(node.getLeftSubTree()!=null)
			return getMin(node.getLeftSubTree());
		return node.getData();
	}
}
