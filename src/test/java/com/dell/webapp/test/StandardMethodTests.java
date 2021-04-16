package com.dell.webapp.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit 5 Standard test annotations.")
public class StandardMethodTests {

	@BeforeAll
	static void setUpAll() {
		System.out.println("--- * Before All Test ----");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("--- * After All Test ----");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("--- * Before each Test ----");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("--- * After each Test ----");
	}
	
	@Test
	@DisplayName("First Sample Test")
	public void testOne() {
		System.out.println("--- Test One is executed ----");
	}
	
	@Test
	@DisplayName("Second Sample Test")
	public void testTwo() {
		System.out.println("--- Test Two is executed ----");
	}
	
	@Test
	@Disabled
	public void testThree() {
		System.out.println("--- Test Three is executed ----");
	}
}
