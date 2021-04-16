package com.dell.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AgeValidatorTest {

	ValidatorUtil valiador;
	
	
	@BeforeEach
	void setUp() throws Exception {
		valiador = new ValidatorUtil();
	}

	@AfterEach
	void tearDown() throws Exception {
		valiador = null;
	}

	@Test
	@DisplayName("Test for valid input as 20")
	void testValid() {
		assertTrue(valiador.validate(20));
		assertEquals(true, valiador.validate(20));
	}
	
	@Test
	@DisplayName("Test for valid input as 17")
	void testInValid() {
		assertFalse(valiador.validate(17));
		assertEquals(false, valiador.validate(17));
	}
	
	@Test
	@DisplayName("Test for valid input as -20")
	void testInValid2() {
		assertFalse(valiador.validate(-20));
		assertEquals(false, valiador.validate(-20));
	}

}
