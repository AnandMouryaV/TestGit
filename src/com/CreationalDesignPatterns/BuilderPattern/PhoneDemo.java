package com.CreationalDesignPatterns.BuilderPattern;

public class PhoneDemo {
	
	public static void main(String[] args) {
		Phone p =new PhoneBuilder().setBattery(3000).setRamSize(4).setBrand("OnePlus").getPhone();
		
		System.out.println(p);
	}
	
	
	
	

}
