package com.home.java8.predicate.durga;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.home.java8.utility.durga.Employee;
import com.home.java8.utility.durga.EmployeeUtility;

public class NameStartWithK {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeUtility.populate_Name_Desig_Sal_Loc(al);
		
		
		Predicate<Employee> namePred = emp -> emp.name.startsWith("A");
		Predicate<Employee> salPred = emp-> emp.salary > 20000;
		
		for(Employee e: al) {
			if(namePred.test(e)) {
				System.out.println("Employee info whos name start with A :"+ e);
			}
			if(salPred.test(e)) {
				System.out.println("Employee info whos sal > 20000 :"+ e);
			}
		}
	}

}
