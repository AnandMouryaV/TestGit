package com.CreationalDesignPatterns;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern singletonObject = new SingletonDesignPattern();

	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getInstance() {
		
		return singletonObject;
	}
	
	

}
