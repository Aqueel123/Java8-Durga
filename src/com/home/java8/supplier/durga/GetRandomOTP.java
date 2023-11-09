package com.home.java8.supplier.durga;

import java.util.function.Supplier;

public class GetRandomOTP {

	public static void main(String[] args) {
		
		Supplier<String> otpSupplier = () -> {
			String otpString = "";
			for(int i=1; i<=6; i++) {
				otpString = otpString + (int) (Math.random()*4);
			}
			return otpString;
		};
		
		System.out.println("Random OTP :"+ otpSupplier.get());
		System.out.println("Random OTP :"+ otpSupplier.get());
	}
}
