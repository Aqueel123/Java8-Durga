package com.home.java8.utility.durga;

import java.util.List;

public class Customer {
	public String name;
	public String address;
	public List<String> phno;
	public String email;
	public Customer(String name, String address, List<String> phno, String email) {
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Name :"+ name +" Address :"+ address + " Phone :"+ phno + " Email :"+ email;
	}
}
