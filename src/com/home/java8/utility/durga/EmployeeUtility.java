package com.home.java8.utility.durga;

import java.util.ArrayList;

import com.home.java8.function.durga.Employee;

public class EmployeeUtility {

	public static void populateName_Sal(ArrayList<Employee> al) {
		al.add(new Employee("Aqueel", 1000.20));
		al.add(new Employee("Sunny", 20000.20));
		al.add(new Employee("Bunny", 14000.20));
		al.add(new Employee("Ravi", 18000.20));
	}
	
	public static void populate_Name_Desig_Sal_Loc(
			ArrayList<com.home.java8.predicate.durga.Employee> list) {
		
		list.add(new com.home.java8.predicate.durga.Employee
				("Durga", "CEO", 30000, "Hyderabad"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Sunny", "Manager", 25000, "Hyderabad"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Malika", "Manager", 25000, "Bangalore"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Kareena", "Lead", 20000, "Chennai"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Aqueel", "Developer", 10000, "Mumbai"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Anushka", "Lead", 20000, "Bangalore"));
		list.add(new com.home.java8.predicate.durga.Employee
				("Sowmya", "Developer", 10000, "Hyderabad"));
	}
	
}
