package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Group multiple assertions")
public class JUnit5AllAssertion {
	
	private static final String FIRST_NAME = "Chuck";
	private static final String LAST_NAME = "Norris";
	
	private Person person;

	@BeforeEach
	void setUp() {
		System.out.println("Setting up the Person Object...");
		person = new Person();
		person.setFirstName(FIRST_NAME);
		person.setLastName(LAST_NAME);
	}
	
	@Test
	@DisplayName("Should have the correct name")
	void correctName() {
		
		assertAll("name",() -> assertEquals(FIRST_NAME, person.getFirstName(),"First name is incorrect"),
					() -> assertEquals(LAST_NAME, person.getLastName(),"Last name is incorrect")
				);
	}
}
