package com.CreationalDesignPatterns.MethodtemplatePattern;

public class Test {
	
	public static void main(String[] args) {
		
		ProcessExcelFile pf = new ProcessExcelFile();
		pf.fileProcessor();
		ProcessTextFile pt = new ProcessTextFile();
		pt.fileProcessor();
	}

}
