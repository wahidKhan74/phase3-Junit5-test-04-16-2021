package com.dell.webapp.test;

public class ValidatorUtil {

	// age validator
	public boolean validate(int age) {
		if(age>18) {
			return true;
		}
		return false;
	}
	
	// full name validator
	public String combine(String firstName, String lastName) {
		
		if(firstName != null && lastName != null) {
			return firstName + " " + lastName;
		}
		return null;
	}
	
	// profile gender validator
	
}
