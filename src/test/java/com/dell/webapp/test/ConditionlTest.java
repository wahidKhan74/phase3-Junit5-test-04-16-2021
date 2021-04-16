package com.dell.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionlTest {

	@BeforeEach
	void setUp() throws Exception {}

	@AfterEach
	void tearDown() throws Exception {}

	@Test
	@DisplayName("Test Run on Windows Operating System")
	@EnabledOnOs({OS.WINDOWS})
	void testRunOnWindows() {
		System.out.println("This test only runs in windows platform.");
		assertTrue(true);
	}
	
	
	@Test
	@DisplayName("Test Run on LINUX Operating System")
	@RepeatedTest(value=3)
	@EnabledOnOs({OS.LINUX})
	void testRunOnLinux() {
		System.out.println("This test only runs in LINUX platform.");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on JRE 1.8")
	@EnabledOnJre(JRE.JAVA_8)
	void testRunOnJRE8() {
		System.out.println("This test only runs in Java 8 platform.");
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on JRE 11")
	@EnabledOnJre(JRE.JAVA_11)
	void testRunOnJRE11() {
		System.out.println("This test only runs in Java 11 platform.");
		assertTrue(true);
	}
	
	
	@Test
	@DisplayName("Test Run on random number")
	@DisabledIf("Math.random() < 0.314")
	void testRunOnSomeRandomNumber() {
		System.out.println("This test  may or may not execute.");
		assertTrue(true);
	}

}
