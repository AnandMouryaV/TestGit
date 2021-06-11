package com.CreationalDesignPatterns.BuilderPattern;

public class Phone {
	
	private String brand;
	private String processor;
	private double screenSize;
	private int ramSize;
	private int battery;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public Phone(String brand, String processor, double screenSize, int ramSize, int battery) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.screenSize = screenSize;
		this.ramSize = ramSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", processor=" + processor + ", screenSize=" + screenSize + ", ramSize="
				+ ramSize + ", battery=" + battery + "]";
	}
	
	

}
