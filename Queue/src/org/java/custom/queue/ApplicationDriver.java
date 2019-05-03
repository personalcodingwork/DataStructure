package org.java.custom.queue;

public class ApplicationDriver {

	public static void main(String[] args) {
	 Queue<Integer> queue = new Queue<Integer>();
	 queue.enQueue(10);
	 queue.enQueue(20);
	 queue.enQueue(30);
	 queue.traverse();
	 System.out.println();
	 queue.deQueue();
	 queue.traverse();
	}

}
