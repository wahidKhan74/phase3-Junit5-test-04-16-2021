package com.dell.webapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Arithmatic Calculator Test")
public class CalculatorNestedTest {
	
	Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}
	
	@AfterEach
	void tearDown() {
		calc = null;
	}
	
	@Nested
	@DisplayName("Addition Test Group")
	class AdditionTestGroup {
		
		@Test
		@DisplayName("Addition Test :: Positive Number")
		void addPositiveNumberTest() {
			assertEquals(300, calc.add(100, 200));
		}
		
		@Test
		@DisplayName("Addition Test :: Negative Number")
		void addNegativeNumberTest() {
			assertEquals(100, calc.add(-100, 200));
		}
	}
	
	@Nested
	@DisplayName("Substraction Test Group")
	class SubstractionTestGroup {
		
		@Test
		@DisplayName("Substration Test 1 :: Positive Number")
		void testForNumberSubstration1() {
			assertEquals(0, calc.sub(100,200));
		}
		
		@DisplayName("Substration Test 2 :: Positive Number")
		@Test
		void testForNumberSubstration2() {
			assertEquals(100, calc.sub(200,100));
		}
		
		@DisplayName("Substration Test 3 :: Negative Number")
		@Test
		void testForNumberSubstration3() {
			assertEquals(0, calc.sub(-200,100));
		}
		
		@DisplayName("Substration Test 4 :: Negative Number")
		@Test
		void testForNumberSubstration4() {
			assertEquals(-300, calc.sub(200, -100));
		}
	}
}
