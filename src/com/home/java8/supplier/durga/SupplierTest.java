package com.home.java8.supplier.durga;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Date> currDate = () -> new Date();
		System.out.println("System current date :"+ currDate.get());
		
		/*Get random name using supplier*/
		Supplier<String> supplier = () -> {
			String[] nameStrings = {"Sunny", "Funny", "Ravi", "Kavi"};
			int randNum = (int) (Math.random() * 4);
			return nameStrings[randNum];
		};
		
		System.out.println("Random name :"+ supplier.get());
		System.out.println("Random name :"+ supplier.get());
		System.out.println("Random name :"+ supplier.get());
		System.out.println("Random name :"+ supplier.get());
	}
}
