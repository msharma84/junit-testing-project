package com.msharma.junit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("JUnit 5 Lifecycle in Repeated Test")
public class JUnit5RepeatedTestLifeCycle {


	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test method...");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test method...");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each test method...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After all test method...");
	}
	
	@DisplayName("Addition of Two Numbers")
	@RepeatedTest(value=5, name=RepeatedTest.LONG_DISPLAY_NAME)
	//@RepeatedTest(value=5, name=RepeatedTest.SHORT_DISPLAY_NAME)
	//@RepeatedTest(value=5, name=RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER)
	public void testAdd() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.add(1, 1),"1 + 1 ie equal to 2");
	}
}
