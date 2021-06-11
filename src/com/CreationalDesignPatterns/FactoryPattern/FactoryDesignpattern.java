package com.CreationalDesignPatterns.FactoryPattern;

import java.util.Scanner;

public class FactoryDesignpattern {

	public static void main(String[] args) {

		CaluculateService c = new CaluculateService();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first operand: ");
		int a = input.nextInt();
		System.out.println("Enter the Second operand: ");
		int b = input.nextInt();

		System.out.println("Enter the type:");
		String type = input.next();

		Caluculate caluculate = c.getCalucuator(type);

		caluculate.operation(a, b);
	}

}
