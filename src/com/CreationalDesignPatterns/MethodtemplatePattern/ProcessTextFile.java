package com.CreationalDesignPatterns.MethodtemplatePattern;

public class ProcessTextFile extends ReadProcessandsave{
	
	public void fileProcessor() {
		readtheFile();
		processtheFile();
		savetoDataBase();
		
	}
	
public void readtheFile() {
	
	
	
		
		System.out.println("Reading the text file");
	}
	
	public void processtheFile() {
		System.out.println("Processing the text file");
	}

	


}
