package com.home.java8.utility.durga;

public class Employee {
	public String name;
	public String designation;
	public Double salary;
	public String city;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, String designation, Double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}



	public String toString() {
		return name + " " + salary;
	}
}
