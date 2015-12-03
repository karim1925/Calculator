package com.esprit.calculatorEjb.calculator;

import javax.ejb.Stateless;

@Stateless
public class CalculatorImplementation implements Calculator {

	@Override
	public double add(double a, double b) {
		
		return a+b;
	}

	@Override
	public double division(double a, double b) {
		
		return   (double)  (a/b);
	}

	@Override
	public double subtraction( double a, double b) {
		
		return a-b;
	}

	@Override
	public double multiplication(double a, double b) {

		return a*b;
	}
	
	
	
	
	

}
