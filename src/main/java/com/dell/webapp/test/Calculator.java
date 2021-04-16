package com.dell.webapp.test;

public class Calculator {

	// addition 
	public float add(float num1 , float num2) {
		return num1 + num2;
	}
	
	// substraction
	public float sub(float num1, float num2) {
		if(num1> num2) {
			return num1 - num2;
		}
		return 0;
	}
	
	// TODO : Follow TDD , write multiplication , division and avg.
}
