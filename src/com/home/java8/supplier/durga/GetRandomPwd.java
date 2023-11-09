package com.home.java8.supplier.durga;

import java.util.function.Supplier;

/*Length should be 8 characters
 * 2,4,6,8 places only digits
 * 1,3,5,7 places only upper case alphabets symbols
 */

public class GetRandomPwd {

	public static void main(String[] args) {
		
		Supplier<String> pwdSupplier = () -> {
			Supplier<Integer> digitSupplier = () -> (int) (Math.random() * 4);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Character> charS = () -> symbols.charAt((int) (Math.random() * 29));
			
			String pwd = "";
			for(int i=1; i<=8; i++) {
				if(i%2 == 0) {
					pwd = pwd + digitSupplier.get(); 
				} else {
					pwd = pwd + charS.get();
				}
			}
			return pwd;
		};
		System.out.println("Auto generated 8 digits password :"+ pwdSupplier.get());
		System.out.println("Auto generated 8 digits password :"+ pwdSupplier.get());
		System.out.println("Auto generated 8 digits password :"+ pwdSupplier.get());
	}
}
