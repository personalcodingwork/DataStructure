package org.java.custom.tree.binarysearchtree;

public class ApplicationDriver {

	public static void main(String[] args) {
		BinarySearchTree<Integer> BST = new BinarySearchTree<Integer>();
		BST.insert(32);
		BST.insert(10);
		BST.insert(55);
		BST.insert(1);
		BST.insert(19);
		BST.insert(79);
		BST.insert(16);
		BST.insert(23);
		
		System.out.println("Minimum element: "+BST.getMin());
		System.out.println("Maximum element: "+BST.getMax());
		BST.traverse();
		BST.delete(1);
		BST.traverse();
		BST.delete(32);
		BST.traverse();
	}

}
