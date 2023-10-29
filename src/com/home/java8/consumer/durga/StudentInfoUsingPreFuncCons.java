package com.home.java8.consumer.durga;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.home.java8.utility.durga.Student;
import com.home.java8.utility.durga.StudentUtility;

public class StudentInfoUsingPreFuncCons {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		StudentUtility.populate(al);
		
		Predicate<Student> marksGreaterThan = s -> s.marks > 60;
		
		Function<Student, String> grade = s -> {
			int marks = s.marks;
			if(marks >= 85) {
				return "A{Distinction]";
			}
			else if(marks >= 60) {
				return "B[First Class]";
			}
			else if(marks >= 50) {
				return "C[Second Class]";
			}
			else if(marks >= 30) {
				return "D[Third Class]";
			}
			else {
				return "F[Failed]";
			}
		};
		
		Consumer<Student> consume = s -> {
			System.out.println("Name :"+ s.name);
			System.out.println("Marks :"+ s.marks);
			System.out.println("Grade :"+ grade.apply(s));
			System.out.println();
		};
		
		for(Student s: al) {
			if(marksGreaterThan.test(s)) {
				consume.accept(s);
			}
		}
	}
}
