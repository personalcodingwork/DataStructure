package org.custom.singly.linkedlist;

public class ApplicationDriver {

	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		//Insert perimative type
		linkedList1.insert(10);
		linkedList1.insert(20);
		linkedList1.insert(30);
		linkedList1.insert(40);
		
		//traverse
		linkedList1.traverseList();
		
		//remove
		linkedList1.remove(30);
		//Traverse
		linkedList1.traverseList();
		
		//Working on custom object
		Person p1 = new Person(1, "Uday");
		Person p2 = new Person(2, "Pratap");
		Person p3 = new Person(3, "Kumar");
		Person p4 = new Person(4, "Jaggu");
		
		List<Person> personList = new LinkedList<Person>();
		personList.insert(p1);
		personList.insert(p2);
		personList.insert(p3);
		personList.insert(p4);
		
		personList.traverseList();
	}

}
