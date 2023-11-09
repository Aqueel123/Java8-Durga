package com.home.java8.utility.durga;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerUtility {
	
	public static void populate(ArrayList<Customer> cust) {
		cust.add(new Customer("Sunny", "Mumbai", 
				Arrays.asList("43224", "534345"),"aqueel@gmail.com"));
		cust.add(new Customer("Bunyy", "Hyderabad",
				Arrays.asList("131313", "4322424"),"bunny@gmail.com"));
		cust.add(new Customer("Tommy", "Secundrabad",
				Arrays.asList("533535", "456466"),"tommy@gmail.com"));
		cust.add(new Customer("Kareena", "Chennai",
				Arrays.asList("75757", "8687686"),"Kareena@gmail.com"));
		cust.add(new Customer("Kapil", "Thane",
				 Arrays.asList("353535", "4564464"), "test@gmail.com"));
	}
}
