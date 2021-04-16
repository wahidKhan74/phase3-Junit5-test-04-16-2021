package com.dell.webapp.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


@DisplayName("Arithmatic Calculator Test")
public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}
	
	@AfterEach
	void tearDown() {
		calc = null;
	}
	
	// TDD : Test Driven Development
	@Test
	@DisplayName("Substration Test 1 :: Positive Number")
	void testForNumberSubstration1() {
		float actual = calc.sub(100,200);
		float expected = 0;
		assertEquals(expected, actual);
	}
	
	@DisplayName("Substration Test 2 :: Positive Number")
	@Test
	void testForNumberSubstration2() {
		float actual = calc.sub(200,100);
		float expected = 100;
		assertEquals(expected, actual);
	}
	
	@DisplayName("Substration Test 3 :: Negative Number")
	@Test
	void testForNumberSubstration3() {
		float actual = calc.sub(-200,100);
		float expected = 0;
		assertEquals(expected, actual);
	}
	
	@DisplayName("Substration Test 4 :: Negative Number")
	@Test
	void testForNumberSubstration4() {
		assertEquals(-300, calc.sub(200, -100));
	}
	
	
	
	@Test
	@DisplayName("Addition Test :: Positive Number")
	void addPositiveNumberTest() {
		float actual = calc.add(100, 200);
		float expected = 300;
//		if(actual == expected) {
//			System.out.println("Test is passed !");
//		} else {
//			System.out.println("Test is failed !");
//		}
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Addition Test :: Negative Number")
	void addNegativeNumberTest() {
		float actual = calc.add(-100, 200);
		float expected = 100;
		assertEquals(expected, actual);
	}
}
