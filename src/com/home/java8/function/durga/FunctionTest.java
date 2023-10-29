package com.home.java8.function.durga;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		Integer stringLength = f.apply("Aqueel");
		System.out.println("Length of String: "+ stringLength);
		
		ArrayList<Student> e1 = new ArrayList<>();
		populate(e1);
		
		Function<Student , String> grade = s -> {
			int marks = s.marks;
			if(marks >= 80) {
				return "A[Distinction]";
			}
			else if(marks >= 60) {
				return "B[First Class]";
			}
			else if(marks >= 50) {
				return "C[Second class]";
			}
			else if(marks >= 35) {
				return "D[Third Class]";
			}
			else {
				return "E[Failed]";
			}
		};
		
		for(Student s: e1) {
			System.out.print("Name: "+ s.name);
			System.out.print(" ,Marks: "+ s.marks);
			System.out.print(" ,Grade :"+ grade.apply(s));
			System.out.println();
		}
		
		/* Display Student info who's marks >= 60*/
		Predicate<Student> predicate = s -> s.marks >= 60;
		for(Student s: e1) {
			if(predicate.test(s)) {
				System.out.println("Students who's marks >= 60");
				System.out.println("Name : "+ s.name + ", Marks : "+ s.marks
						+", Grade : "+ grade.apply(s));
			}
		} 
		/************************************************/		
	}
	
	public static void populate(ArrayList<Student> al) {
		al.add(new Student("Aqueel", 40));
		al.add(new Student("Sunny", 85));
		al.add(new Student("Bunney", 50));
		al.add(new Student("Chinny", 30));
		al.add(new Student("Vinay",  45));
		al.add(new Student("Kareena", 35));
	}

}
