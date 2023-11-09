package com.home.java8.map_flapMap.durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.utility.durga.Customer;
import com.home.java8.utility.durga.CustomerUtility;

public class MapExample {

	public static void main(String[] args) {
		ArrayList<Customer> aList = new ArrayList<>();
		CustomerUtility.populate(aList);
		System.out.println(aList);
		
		List<String> emailsList = aList.stream().map(cust -> cust.email).collect(Collectors.toList());
		System.out.println("List of customers email :" +emailsList);
		
		List<String> phonList = aList.stream().flatMap(cust -> cust.phno.stream()).collect(Collectors.toList());
		System.out.println(phonList);
	}
}
