package com.home.java8.function.durga;

public class Employee {
	String name;
	Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return name + " " + salary;
	}
}
