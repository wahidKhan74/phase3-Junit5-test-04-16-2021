package com.dell.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsTest {

	String firstName = "John";
	String lastName;
	int age = 35;
	String[] family  = {"Mike","David","Marry"};
	String[] names  = {"Mike","David","Marry"};
	String[] people  = {"Mike","David"};
	String[] people2  = {"John","David"};
	int numbers[]  = {10,20,30};
	

	@Test
	@DisplayName("Assetions Examples")
	void testForAssertions() {
		
		// assertEquals
		assertEquals(200.0, 200.0);
		assertEquals(35, age);
		assertEquals("John", firstName);
		assertEquals(true, true);
		
		// assertTrue
		assertTrue(true);
		// assertTrue(false); this fails
		assertTrue(1000>200);
		
		// assertFalse
		assertFalse(false);
		// assertFalse(true);  // this fails
		assertFalse(3000>50000);
		
		// assertNull : expression expected as null
		assertNull(lastName);
		// assertNull(firstName); // this fails
		
		// assertNotNull : expression expected as not null
		assertNotNull(firstName);
		// assertNotNull(null);  // this fails
		
		// array comparison
		assertArrayEquals(names, family);
		// assertArrayEquals(names, people);  // this fails
		// assertArrayEquals(people2, people); // this fails
		
		// assertThrows
		assertThrows(RuntimeException.class, ()->{
			throw new RuntimeException();
		});
		
		// fail("This will alway fails ");
	}

}
