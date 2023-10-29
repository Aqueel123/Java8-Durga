package com.home.java8.predicate.durga;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.home.java8.utility.durga.EmployeeUtility;

public class PredicateTest {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeUtility.populate_Name_Desig_Sal_Loc(al);
		
		System.out.println("All employees info before modification \n "+ al);
		
		Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
		System.out.println("All managers details");
		display(p1, al);
		
		Predicate<Employee> p2 = emp -> emp.city.equals("Bangalore");
		System.out.println("All Employee from Bangalore");
		display(p2, al);
		
		Predicate<Employee> p3 = emp -> emp.salary < 20000;
		System.out.println("All Employee information who's salary <20000 ");
		display(p3, al);
		
		System.out.println("All Managers from Bangalore");
		display(p1.and(p2), al);
		
		System.out.println("All Employee either manager or salary < 20000");
		display(p1.or(p3), al);
	}
	
	
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for(Employee emp: list) {
			if(p.test(emp)) {
				System.out.println( emp);
			}
		}
		System.out.println("************************************************************");
	}

}
