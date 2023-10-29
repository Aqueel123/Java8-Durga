package com.home.java8.consumer.durga;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.home.java8.utility.durga.Student;
import com.home.java8.utility.durga.StudentUtility;

public class ConsumerTest {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		StudentUtility.populate(al);

		/* Display student information using Consumer */
		Consumer<Student> consum = s -> {
			System.out.println("Name :" + s.name);
			System.out.println("Marks :" + s.marks);
			System.out.println();
		};

		for (Student s : al) {
			consum.accept(s);
		}
	}
}
