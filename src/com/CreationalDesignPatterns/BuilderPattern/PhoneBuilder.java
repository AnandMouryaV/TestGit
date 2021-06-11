package com.CreationalDesignPatterns.BuilderPattern;

public class PhoneBuilder {
	
	private String brand;
	private String processor;
	private double screenSize;
	private int ramSize;
	private int battery;
	
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		
		return new Phone(brand, processor, screenSize, ramSize, battery);
	}
	
	

}
