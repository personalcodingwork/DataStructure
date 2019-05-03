package org.java.custom.stack;


public class Person implements Comparable<Person>{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.id, o.getId());
	}
	 
	public String toString() {
		return this.name;
	}
}
