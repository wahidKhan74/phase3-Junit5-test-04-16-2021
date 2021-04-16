package com.dell.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FullNameTest {

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
	@DisplayName("FullName validation test")
	void testForFullName() {
		assertEquals("John Smith", valiador.combine("John", "Smith"));
		assertNotNull(valiador.combine("John", "Smith"));
	}
	
	@Test
	@DisplayName("FullName validation test for input null")
	void testForFullNameWithNull() {
		
		assertEquals(null, valiador.combine("John", null));
		assertEquals(null, valiador.combine(null, "Smith"));
		assertNull(valiador.combine("John", null));
		assertNull(valiador.combine(null, "Smith"));
	}

}
