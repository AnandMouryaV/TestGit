package com.CreationalDesignPatterns.FactoryPattern;

public class CaluculateService {
	
	Caluculate caluculate;
	public Caluculate getCalucuator(String type) {
		
		if(type.equalsIgnoreCase("Add")) {
			caluculate = new Add();
		}else if(type.equalsIgnoreCase("subtract")){
			{
				caluculate = new Subtract();
			}
			
		}else if(type.equalsIgnoreCase("multiply")) {
			caluculate = new Multiply();
			
		}
		else if(type.equalsIgnoreCase("divide")) {
			caluculate= new Divide();
		}
		else {
			System.out.println("We do nothing---");
		}
		
		return caluculate;
		
	}

}
