package com.CreationalDesignPatterns.StrategyPattern;

public class Player {
	private IStategy stategy;
	private String playerType;

	public Player(String playerType) {

		this.playerType = playerType;
	}

	public void setStategy(IStategy stategy) {
		this.stategy = stategy;
	}

	public void action() {
		System.out.println("Action in progress.."+playerType);
		stategy.attackMode();

		
	}

}
