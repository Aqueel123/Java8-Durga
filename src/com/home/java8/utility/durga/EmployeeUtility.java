package com.home.java8.utility.durga;

import java.util.ArrayList;

public class EmployeeUtility {

	public static void populateName_Sal(ArrayList<Employee> al) {
		al.add(new Employee("Aqueel", 1000.20));
		al.add(new Employee("Sunny", 20000.20));
		al.add(new Employee("Bunny", 14000.20));
		al.add(new Employee("Ravi", 18000.20));
	}
	
	public static void populate_Name_Desig_Sal_Loc(
			ArrayList<Employee> list) {
		
		list.add(new Employee("Durga", "CEO", 30000.0, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 25000.0, "Hyderabad"));
		list.add(new Employee("Malika", "Manager", 25000.0, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 20000.0, "Chennai"));
		list.add(new Employee("Aqueel", "Developer", 10000.0, "Mumbai"));
		list.add(new Employee("Anushka", "Lead", 20000.0, "Bangalore"));
		list.add(new Employee("Sowmya", "Developer", 10000.0, "Hyderabad"));
	}
	
}
