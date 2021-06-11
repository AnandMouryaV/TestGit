package com.CreationalDesignPatterns.MethodtemplatePattern;

public abstract class ReadProcessandsave {

	public void fileProcessor() {
		readtheFile();
		readtheFile();
		savetoDataBase();

	}

	public abstract void readtheFile();

	public abstract void processtheFile();

	public void savetoDataBase() {
		System.out.println("Saving to the database");
	}

}
