package com.home.java8.function.durga;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import com.home.java8.utility.durga.Employee;
import com.home.java8.utility.durga.EmployeeUtility;

public class SalaryIncrement {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeUtility.populateName_Sal(al);
		
		System.out.println("Employees details before modification \n "+al);
		
		Predicate<Employee> lessSalEmp = emp -> emp.salary <= 10000;
		
		Function<Employee, Employee> increFunc = 
				emp -> {
					emp.salary += 10000;
					return emp;
				};
		
		for(Employee e: al) {
			if(lessSalEmp.test(e)) {
				increFunc.apply(e);
			}
		}
		
		System.out.println("Employees details after increment \n "+ al);
	}
}
