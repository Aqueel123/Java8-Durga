package com.home.java8.utility.durga;

public class Student {
	public String name;
	public int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return name +" : "+ marks;
	}
}
