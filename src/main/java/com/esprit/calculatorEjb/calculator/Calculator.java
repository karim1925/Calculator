package com.esprit.calculatorEjb.calculator;

import javax.ejb.Remote;

@Remote
public interface Calculator {
	
		
	double add(double i, double j);

	double division(double a, double b);

	double subtraction(double a, double b);

	double multiplication(double a, double b);
		 
	}


