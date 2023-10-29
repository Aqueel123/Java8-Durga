package com.home.java8.predicate.durga;

public class Employee {
	public String name;
	public String designation;
	public double salary;
	public String city;
	
	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	
	public String toString() {
		String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
		return s;
	}
}
