package com.home.java8.function.durga;

import java.util.ArrayList;
import java.util.function.Function;

import com.home.java8.utility.durga.Employee;
import com.home.java8.utility.durga.EmployeeUtility;

public class TotalMonthOfAllEmpSal {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeUtility.populateName_Sal(al);
		System.out.println("Student details before any modification");
		System.out.println(al);
		
		Function<ArrayList<Employee>, Double> totalSal = emp -> {
			double total = 0;
			for(Employee e: al) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("Total month salary of all employees :"+ totalSal.apply(al));
	}
}
