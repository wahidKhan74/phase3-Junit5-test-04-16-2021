package com.dell.webapp.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Outer Test Class")
public class NestedTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("--- OT Before Each ---");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("--- OT After Each ---");
	}
	
	@Test
	void testOuter() {
		System.out.println("--- Outer Test Executed ---");
		assertTrue(true);
	}
	
	@Nested
	@DisplayName("Inner Test Group")
	class InnerTest {
		
		@Test
		void testOne() {
			System.out.println("--- Test one executed ---");
			assertTrue(true);
		}
		
		@Test
		void testTwo() {
			System.out.println("--- Test one executed ---");
			assertTrue(true);
		}
	}
}
