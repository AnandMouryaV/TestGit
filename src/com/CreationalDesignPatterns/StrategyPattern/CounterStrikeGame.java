package com.CreationalDesignPatterns.StrategyPattern;

public class CounterStrikeGame {
	
	public static void main(String[] args) {
		Player terrorist = new Player("terrorist");
		Player counterTerrorist = new Player("counterTerrorist");
		
		System.out.println("Before planting the bomb");
		
		terrorist.setStategy(new Attacking());
		counterTerrorist.setStategy(new Defensive());
		
		terrorist.action();
		counterTerrorist.action();
		System.out.println("After planting the bomb");
		
		
		terrorist.setStategy(new Defensive());
		counterTerrorist.setStategy(new Attacking());
		
		terrorist.action();
		counterTerrorist.action();
	}
}
